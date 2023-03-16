public class main {
  public static void main(String[] args) {
    double[] inp_coords = {150.2, 120.3};
    double[] ndc_coords = CoordinatesConverter.inp_to_ndc(inp_coords[0], inp_coords[1]);
    double[] user_coords = CoordinatesConverter.ndc_to_user(ndc_coords[0], ndc_coords[1]);
    System.out.println("NDC coordinates: (" + user_coords[0] + ", " + user_coords[1] + ")");
  }
}
