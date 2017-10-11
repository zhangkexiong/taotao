import org.csource.fastdfs.*;
import org.junit.Test;

/**
 * @Author: Small Bear
 * @Description:
 * @Data:Create in 21:09 2017/10/11
 * @Modified By:Small Bear
 */
public class FileUploadTest {
        @Test
        public void uploadFile() throws Exception {
            //1、向工程中添加jar包
            //2、创建一个配置文件。配置tracker服务器地址
            //3、加载配置文件
            ClientGlobal.init("G:\\taotao\\webtt\\src\\main\\resources\\client.conf");
            //4、创建一个TrackerClient对象。
            TrackerClient trackerClient = new TrackerClient();
            //5、使用TrackerClient对象获得trackerserver对象。
            TrackerServer trackerServer = trackerClient.getConnection();
            //6、创建一个StorageServer的引用null就可以。
            StorageServer storageServer = null;
            //7、创建一个StorageClient对象。trackerserver、StorageServer两个参数。
            StorageClient storageClient = new StorageClient(trackerServer, storageServer);
            //8、使用StorageClient对象上传文件。
            String[] strings = storageClient.upload_file("G:\\taotao\\webtt\\src\\main\\web\\a.jpg", "jpg", null);
            for (String string : strings) {
                System.out.println(string);

            }
        }

}
