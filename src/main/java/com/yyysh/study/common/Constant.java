package com.yyysh.study.common;
/**
 * 枚举常量
 * @Auther hxy
 * @Date 2017/4/27
 */
public class Constant {
    /**
     * 超级用户
     */
    public static final String SUPERR_USER="026a564bbfd84861ac4b65393644beef";

    /**
     * 系统默认密码
     */
    public static final String DEF_PASSWORD="123456";

    /**
     * 分页条数
     */
    public static final int pageSize=10;

    /**
     * 用户缓存
     */
    public static final String USER_CACHE="userCache";

    /**
     * 数据字典缓存
     */
    public static final String CODE_CACHE="codeCache";



    /*******************************数据字典mark 开始*************************/

    /**
     * 文章
     */
    public static final String ARTCLE_TYPE ="artcle_type";

    /*******************************数据字典mark 结束*************************/

    /**
     * 菜单类型
     */
    public enum MenuType{
        /**
         * 菜单
         */
        MENU("1"),
        /**
         * 按钮
         */
        BUTTON("2"),
        /**
         * 目录
         */
        CATALOG("0");
    	
        private String value;

        private MenuType(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }

    /**
     * 是否类型
     */
    public enum YESNO{
        /**
         * 是
         */
        YES("0"),
        /**
         * 否
         */
        NO("1");
        private String value;

        private YESNO(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }

    /**
     * 系统用户状态
     */
    public enum ABLE_STATUS{
        /**
         * 正常
         */
        YES("0"),
        /**
         * 禁用
         */
        NO("1");
        private String value;

        ABLE_STATUS(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }


    /**
     * 返回状态值
     */
    public enum RESULT{
        /**
         * 成功
         */
        CODE_YES("0"),
        /**
         * 失败
         */
        CODE_NO("1"),
        /**
         * 失败msg
         */
        MSG_YES("操作成功"),
        /**
         * 失败msg
         */
        MSG_NO("操作失败");
        private String value;

        private RESULT(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }


    /**
     * 码值类型
     */
    public enum CodeType {
        /**
         * 目录
         */
        CATALOG("1"),
        /**
         * 字典码
         */
        CODE("2");

        private String value;

        private CodeType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 机构类型
     */
    public enum OrganType {
        /**
         * 根节点
         */
        CATALOG("0"),
        /**
         * 机构部门
         */
        ORGAN("1");

        private String value;

        private OrganType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 通知类型
     */
    public enum noticeType {
        /**
         *普通通知
         */
        MAIL_NOTICE("1"),
        /**
         * 流程通知
         */
        OA_NOTICE("2"),
        /**
         * jira通知
         */
        JIRA_NOTICE("3"),
        /**
         * 短信通知
         */
    	TEXT_NOTICE("4");

        private String value;

        private noticeType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
