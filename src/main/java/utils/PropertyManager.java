package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    private static Properties props = new Properties();

    public Properties getPropsProduction() throws IOException {
        InputStream is = null;
        String propsFileName = "application-Production.properties";
        if(props.isEmpty()){
            try{
                is = getClass().getClassLoader().getResourceAsStream(propsFileName);
                props.load(is);
            } catch (IOException e) {
                System.out.println("Failed to load config properties. ABORT!!");
            } finally {
                if(is != null){
                    is.close();
                }
            }
        }
        return props;
    }
    public Properties getPropsDevel() throws IOException {
        InputStream is = null;
        String propsFileName = "application-Devel.properties";
        if(props.isEmpty()){
            try{
                is = getClass().getClassLoader().getResourceAsStream(propsFileName);
                props.load(is);
            } catch (IOException e) {
                System.out.println("Failed to load config properties. ABORT!!");
            } finally {
                if(is != null){
                    is.close();
                }
            }
        }
        return props;
    }
    public Properties getPropsDemo() throws IOException {
        InputStream is = null;
        String propsFileName = "application-Demo.properties";
        if(props.isEmpty()){
            try{
                is = getClass().getClassLoader().getResourceAsStream(propsFileName);
                props.load(is);
            } catch (IOException e) {
                System.out.println("Failed to load config properties. ABORT!!");
            } finally {
                if(is != null){
                    is.close();
                }
            }
        }
        return props;
    }
}
