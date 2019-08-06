package softart.task.talk;

import softart.EmpowerServiceFeature;
import softart.task.TaskServer;
import softart.task.TaskRequestFeature;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;

public class TalkServer implements TaskServer {
    private TaskRequestFeature request = null;
    private Socket socket = null;

    public TalkServer(){}

    public TalkServer(TaskRequestFeature requestFeature, Socket socket){
        this.request = requestFeature;
        this.socket = socket;
    }

    /**
     * 本处理任务针对的任务类型
     */
    @Override
    public String taskMask() {
        return EmpowerServiceFeature.Privileges.TalkService.toString();
    }

    /**
     * 新建可运行处理实体
     *
     * @param request 消息头XML的根节点
     * @param reader  socket端口
     * @param writer
     * @return 返回一个可运行实体
     */
    @Override
    public TaskServer newEntities(TaskRequestFeature request, BufferedReader reader, BufferedWriter writer) {
        TalkServer rtn = new TalkServer();


        return rtn;
    }

    /**
     * 执行任务
     */
    @Override
    public void taskProcess() {
        System.out.println("I am working.");
        System.out.println("I am done.");
    }
}
