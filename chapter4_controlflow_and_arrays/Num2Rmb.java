import java.util.Arrays;

public class Num2Rmb
{
  private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒","捌","玖"};
  private String[] unitArr = {"十", "百", "千", "万", "亿"};

  /**
   *
   * @param num number need to be divide.
   * @return Integer and Partical
   */

  private String[] divide(double num)
  {
	// String Result
	String[] result;
	// result = String("");
	// get
	long zheng = (long) num;
	// 
	long xiao = Math.round((num - zheng) * 100);


	return new String[] {zheng + "", String.valueOf(xiao)};
	// return new String[] {String.valueOf(zheng), String.valueOf(xiao)};
  }

  private String toHanStr(String numStr)
  {
    String result = "";
    int numLen = numStr.length();
	
	for (int i = 0; i < numLen; i++)
	{
        // 把char型转成int型数字，因为它们的ASCII码值恰好相差48
        // 因此把char型数字减去48，得到int型数字， 例如‘4’被转换成4
        int num = numStr.charAt(i) - 48;

        if (i != numLen - 1 && num != 0)
	    {
            result += hanArr[num] + unitArr[numLen - 2 - i];
        }
        else
        {
            result += hanArr[num];
        }
	}

	
	return result;
  }

  public static void main(String[] args){
	Num2Rmb nr = new Num2Rmb();

	System.out.println(Arrays.toString(nr.divide(236711125.123)));
    System.out.println(nr.toHanStr("6100"));
  }

}
