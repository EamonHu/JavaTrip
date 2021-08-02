package cn.eamon.study;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/30 16:11
 */
public class RpcProxyServer {

    private final ExecutorService executorService = Executors.newCachedThreadPool();

    public void publish(Object service, Integer port) throws IOException {

        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket(port);
            while (true){
                final Socket socket = serverSocket.accept();
                executorService.execute(new ProcessHandler(socket, service));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            serverSocket.close();
        }
    }
}
