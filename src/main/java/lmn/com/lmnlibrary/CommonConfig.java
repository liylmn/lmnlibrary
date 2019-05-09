package lmn.com.lmnlibrary;

import lmn.com.lmnlibrary.imageloader.ILoader;

/**
 * Created by admin on 2017/3/9.
 */

public class CommonConfig {
    public static int HTTP_READ_TIME_OUT = 15;
    public static int HTTP_CONNECT_TIME_OUT = 15;
//        public static String BASE_URL = "http://ehu.sinocode.pro:8060/";
//        public static String BASE_URL = "http://10.192.4.176:8090/";//xieqize本地
//        public static String BASE_URL = "http://192.168.100.72:8080/";//公司本地
    public static String RESTAURANT_URL = "http://10.177.128.51:9099/";//正式版
//        public static String RESTAURANT_URL = "http://192.168.100.72:9099/";//公司本地
//        public static String RESTAURANT_URL = "http://10.192.4.176:9099/";//xieqize本地

    public static String QR_CODE_URL = "http://10.177.128.51:9090/shs-thirdpay/wxpay/payByBarCode";//生成支付二维码正式版
//    public static String PAY_QR_CODE_URL = "http://10.177.128.51:9090/shs-thirdpay/tool/getQrCodeImage?data=";//正式版
    public static String ISPAY = "http://10.177.128.51:9090/shs-thirdpay/wxpay/quertById";//是否支付成功正式版
//        public static String QR_CODE_URL = "http://192.168.100.75:8081/shs-thirdpay/wxpay/payByBarCode";
//    public static String PAY_QR_CODE_URL = "http://192.168.100.75:8081/shs-thirdpay/tool/getQrCodeImage?data=";
//    public static String ISPAY = "http://192.168.100.75:8081/shs-thirdpay/wxpay/quertById";
    public static String BASE_URL = "http://10.177.128.51:8002/";//正式版
    //    public static String BASE_URL = "http://10.177.124.228:1212/";
    public static String  PINLV= "300";
    public static boolean DEBUG = true;
    public static String SHARE_PREFERENCE_FILE_NAME = "liylmn";
    public static boolean LOGIN = true;
    // #imageloader
    public static final int IL_LOADING_RES = ILoader.Options.RES_NONE;
    public static final int IL_ERROR_RES = ILoader.Options.RES_NONE;

    public static String CRASH_INFO = "crash_info";

    //设备类型
    public static String EQU_TYPE = "3";

}
