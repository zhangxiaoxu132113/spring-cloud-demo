package com.example.demo.common;

/**
 * 
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名:zhangdonglong 工号
 * @version  [版本号, 2017年7月31日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public enum StatusCode {
    
    SUCCESS("0","成功"),
    FAIL("1", "失败"),
    ACCESSTOKEN_EXPIRE("3","请重新登录"),
    ACCESSTOKEN_NULL("3","请重新登录"),
    ACCESSTOKEN_NOT_EXIST("3","请重新登录"),
    ACCESSTOKEN_NO_USER("3","请重新登录"),
    USER_LOCAL_NOT_EXIST("4","用户登录信息不存在"),
    BIND_PHONE_ALREADY_EXIST("5","要绑定的新手机号已经注册过"),
    USER_ALREADY_ADD("6","用户已注册过"),
    PASSWORD_SURE_ERR("7","确认密码与登录密码不一致"),
    TOKEN_NOT_EXISTS("8","token不正确,请重新获取token"),
    TIME_FORMAT_ERROR("9","日期格式错误"),

    TOKEN_IMEI_ALL_EMPTY("10","token 与 imei 不能全为空"),
    AUTH_ERRO("11","认证失败"),
    AUTH_NO_BIND_PHONE("12", "第三方帐号还没绑定手机号"),
    ACCOUNT_OR_PWD_ERR("13", "账号或密码错误"),
    PARAM_ERR("14", "输入参数错误"),
    VERIFY_CODE_NOT_EXIST("15", "验证码不存在"),
    VERIFY_CODE_OVER_TIME("16", "验证码已过期"),
    VERIFY_CODE_ERR("17", "验证码不正确"),
    PHONE_FORMAT_ERR("18", "手机号格式不正确"),
    OPEN_ID_ERR("19","openId 无法从第三方获取信息"),
    
    PAGE_NO_ERR("20","pageNumber 不正确"),
    PAGE_SIZE_ERR("21","pageSize 不正确"),
    DELETE_BROWSE_HISTORY_ERR("22","删除浏览痕迹失败,是否ID不存在"),
    OPENID_NOT_EXIST("23","openid 不存在"),
    PHONE_ALREADY_BIND("24","手机号已绑定其它 openId"),
    OPENID_ALREADY_BIND("25","openId 已绑定其它手机号"),
    FEED_BACK_CONTENT_LENTH_ERR("26","意见反馈问题描述字段长度：8≤文本≤100"),
    FEED_BACK_TYPE_LENTH_ERR("27","意见反馈问题类型字段长度：1≤文本≤30"),
    FEED_BACK_ID_NOT_EXIST("28","意见反馈 ID 不存在"),
    LOGIN_FAIL("29","登录内部异常"),

    DEL_DELIVERY_ADDRESS_ERR("30","删除收货地址失败"),
    SET_DEFAULT_ADDRESS_ERR("31","设置默认收货地址"),
    BIND_PHONE_ERR("32","绑定手机号失败"),
    ACCOUNT_DATA_ERR("33","该手机号帐号信息存在异常"),
    BIND_TYPE_OR_OPENID_ERR("34","openId 不存在,请先调用登陆接口"),
    PHONE_REGISTERED("35","该手机号已经注册"),
    PHONE_NOT_REGISTER("35","该手机号还没有注册"),
    PROVINCE_ADCODE_NOT_FOUND("36","省 adcode 不存在"),
    CITY_ADCODE_NOT_FOUND("37","市 adcode 不存在"),
    DISCTRICT_ADCODE_NOT_FOUND("38","区 adcode 不存在"),
    ENUM_ERR("39","枚举类型错误"),

    REG_ERR("40","注册失败"),
    ADD_PRODUCT_ERR("41","productCode=%s的商品已经存在，请不要重复添加"),


    
    CONTRACT_CNUMBER_EXISTS("51","合同编号已经存在"),
    CONTRACT_CREATE_ERROR("52","合同签署错误,请联系管理员"),
    CONTRACT_TYPE_ERROR("53","合同行业类型不存在"),
    CONTRACT_EXPORT_ERROR("54","合同导出错误,请联系管理员"),

    WECHATPAY_IO_ERROR("85","微信支付IO错误"),
    ALIPAY_TRANSCODING_ERROR("86","支付宝支付转码错误"),
    ALIPAY_TRANSNOTIFY_ERROR("87","支付宝支付通知错误"),
    ALIPAY_TRANSBEAN_ERROR("88","支付宝支付通知转换bean错误"),
    ALIPAY_TRANSSELECT_ERROR("89","支付宝支付查询错误"),
    UNION_TRANSNOTIFY_ERROR("90","银联支付通知错误"),
    UNION_TRANSSELECT_ERROR("91","银联支付查询错误"),
    
    NON_REPEATABLE_APPLY("100","不能重复申请退款"),    
    ERROR("500","服务器内部错误"),
    PARAMTER("400","请求参数错误,调试阶段"),
    NOT_DATA("42","暂无数据")
    ;
    private String value;
    private String msg;
    private StatusCode(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }
    /**
     * 获取 value
     * @return 返回 value
     */
    public String getValue() {
        return value;
    }
    /**
     * 获取 msg
     * @return 返回 msg
     */
    public String getMsg() {
        return msg;
    }
    
}
