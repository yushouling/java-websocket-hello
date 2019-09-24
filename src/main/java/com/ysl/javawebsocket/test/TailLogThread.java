package com.ysl.javawebsocket.test;

import javax.websocket.Session;
import java.io.*;

public class TailLogThread extends Thread {

    private BufferedReader reader;
    private Session session;

    public TailLogThread(InputStream in, Session session) throws UnsupportedEncodingException {
        this.reader = new BufferedReader(new InputStreamReader(in, "GBK"));
        this.session = session;
    }

    @Override
    public void run() {
        String line;
        try {
            while(reader != null && (line = reader.readLine()) != null) {
                // 解决乱码：
                line = new String(line);
                // 将实时日志通过WebSocket发送给客户端，给每一行添加一个HTML换行
                session.getBasicRemote().sendText(line + "<br>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}