package com.example.websocketdemo.common;
/**
 * 常量
 * @author july
 * @date 2018年2月7日
 */
public class WebSocketConstant {

	/**
	 * 链接地址
	 */
    public static final String WEBSOCKET_PATH_PERFIX = "/push";
    public static final String WEBSOCKET_PATH = "/user/init";
    /**
     * 消息代理路径
     */
    public static final String WEBSOCKET_BROADCAST_PATH = "/topic";
    /**
     * 前端发送给服务端请求地址,用于初始化及绑定用户
     */
    public static final String FORETO_SERVER_PATH = "/bind";
    /**
     * 服务端生产地址,客户端订阅此地址以接收服务端生产的消息,此地址所有用户都订阅
     */
    public static final String PRODUCER_PATH = "/topic/notify";
    /**
     * 点对点消息推送地址前缀
     */
    public static final String P2P_PUSH_BASE_PATH = "/user";
    /**
     * 点对点消息推送地址后缀,最后的地址为/user/用户识别码/msg
     */
    public static final String P2P_PUSH_PATH = "/msg";
    
    public static final String USER_ID = "userid";
    public static final String WS_SESSION = "ws_sessionid";
    
    /**
     * 推送类型 ：0-消息红点
     */
    public static final String PUSH_TYPE_HONGDIAN = "0";

    /**
     * 订阅广播topic名称的前缀
     */
    public static final String TOPIC_ALL_PREFIX = "topic";
    /**
     * 订阅一对一topic名称的前缀
     */
    public static final String TOPIC_USER_PREFIX = "user";

}
