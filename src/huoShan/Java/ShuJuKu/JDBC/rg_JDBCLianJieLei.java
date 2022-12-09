
package huoShan.Java.ShuJuKu.JDBC;

public class rg_JDBCLianJieLei {

    public static boolean rg_ShiFouYouXiao3 (java.sql.Connection rg_DuiXiangZiShen172, int rg_ChaoShiMiaoShu) {
        try {
            java.sql.DatabaseMetaData data = rg_DuiXiangZiShen172.getMetaData();
            if (data == null || data.getJDBCMajorVersion() < 4) return false;
            return rg_DuiXiangZiShen172.isValid(rg_ChaoShiMiaoShu);
        }catch (Exception e){ return false; }
    }
}
