package com.utils.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.yaml.snakeyaml.Yaml;

public class Config {
    Logger logger = Logger.getLogger(Config.class.getName());
    private static Map<String, Map<String, Object>> props;

    public Config() {
        props = new HashMap<>();
        Yaml yaml = new Yaml();
        InputStream in = null;
        try {
            String path = "Java/ticketing/config/srv.yml";
            in = new FileInputStream(path);
            assert(in != null);
            logger.info("in--------" + in);
            props = yaml.loadAs(in, HashMap.class);
            assert(props != null);
            logger.info(String.format(props.toString()));
        } catch (Exception e) {
            // TODO:
            logger.info(String.format("ooooooo" + e.toString()));
            e.printStackTrace();
        } finally {
            logger.info("Props got");
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Object getProp(String root, String key) {
        logger.info("getProp table: " + root);
        Map<String, Object> rootProp = props.get(root);
        logger.info("props: " + props);
        assert(rootProp.containsKey(key));
        return rootProp.get(key);
    }

}
