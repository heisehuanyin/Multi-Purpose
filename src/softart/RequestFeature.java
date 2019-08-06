package softart;

import org.w3c.dom.Document;

import java.net.Socket;

public interface RequestFeature {
    /**
     * 获取用户id标识符
     * @return id标识符
     */
    String getUuidStr();

    /**
     * 获取密码或Token
     * @return 关键字符串
     */
    String getKeyString();

    /**
     * 返回Request的字符串表示
     * @return 字符串表示
     */
    String toString();

    /**
     * 通过本接口获取内部domcument 模型
     * @return 获取模型
     */
    Document getDoc();

    /**
     * 向socket端口发送request
     * @param socket 端口
     */
    void postRequestToSocket(Socket socket) throws MsgException;
}
