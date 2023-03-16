public class CoordinatesConverter {
  private static final double DC_XMIN = 100.3;
  private static final double DC_YMIN = 100.3;
  private static final double DC_XMAX = 300.3;
  private static final double DC_YMAX = 300.3;
  
  private static final double USER_XMIN = 0;
  private static final double USER_YMIN = 0;
  private static final double USER_XMAX = 1920;
  private static final double USER_YMAX = 1080;
  
  public static double[] inp_to_ndc(double inp_x, double inp_y) {
      double ndc_x =(inp_x - DC_XMIN) / (DC_XMAX - DC_XMIN) ;
      double ndc_y =(inp_y - DC_YMIN) / (DC_YMAX - DC_YMIN) ;
      //System.out.println(ndc_y);
      return new double[]{ndc_x, ndc_y};
  }
  
  public static double[] ndc_to_user(double ndc_x, double ndc_y) {
      double user_x = Math.round(ndc_x*(USER_XMAX-1));
      double user_y = Math.round(ndc_y*(USER_YMAX-1));
      return new double[]{user_x, user_y};
  }
  /**
  public static double[] user_to_ndc(double user_x, double user_y) {
      double ndc_x = 2 * (user_x - USER_XMIN) / (USER_XMAX - USER_XMIN) - 1;
      double ndc_y = 2 * (user_y - USER_YMIN) / (USER_YMAX - USER_YMIN) - 1;
      return new double[]{ndc_x, ndc_y};
  }
  
  public static double[] ndc_to_dc(double ndc_x, double ndc_y) {
      double dc_x = (ndc_x + 1) / 2 * (DC_XMAX - DC_XMIN) + DC_XMIN;
      double dc_y = (ndc_y + 1) / 2 * (DC_YMAX - DC_YMIN) + DC_YMIN;
      return new double[]{dc_x, dc_y};
  } */


}
