package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

public final class m
{
  public static String bi(String paramString)
  {
    GMTrace.i(13864557084672L, 103299);
    MessageDigest localMessageDigest = MessageDigest.getInstance("SHA1");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localByteArrayOutputStream.write(paramString.getBytes("UTF-8"));
    paramString = bytesToHex(localMessageDigest.digest(localByteArrayOutputStream.toByteArray()));
    GMTrace.o(13864557084672L, 103299);
    return paramString;
  }
  
  private static String bytesToHex(byte[] paramArrayOfByte)
  {
    int i = 0;
    GMTrace.i(13864691302400L, 103300);
    char[] arrayOfChar1 = new char[16];
    char[] tmp18_16 = arrayOfChar1;
    tmp18_16[0] = 48;
    char[] tmp23_18 = tmp18_16;
    tmp23_18[1] = 49;
    char[] tmp28_23 = tmp23_18;
    tmp28_23[2] = 50;
    char[] tmp33_28 = tmp28_23;
    tmp33_28[3] = 51;
    char[] tmp38_33 = tmp33_28;
    tmp38_33[4] = 52;
    char[] tmp43_38 = tmp38_33;
    tmp43_38[5] = 53;
    char[] tmp48_43 = tmp43_38;
    tmp48_43[6] = 54;
    char[] tmp54_48 = tmp48_43;
    tmp54_48[7] = 55;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[8] = 56;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[9] = 57;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[10] = 97;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[11] = 98;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[12] = 99;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[13] = 100;
    char[] tmp96_90 = tmp90_84;
    tmp96_90[14] = 101;
    char[] tmp102_96 = tmp96_90;
    tmp102_96[15] = 102;
    tmp102_96;
    int k = paramArrayOfByte.length;
    char[] arrayOfChar2 = new char[k * 2];
    int j = 0;
    while (i < k)
    {
      int m = paramArrayOfByte[i];
      int n = j + 1;
      arrayOfChar2[j] = arrayOfChar1[(m >>> 4 & 0xF)];
      j = n + 1;
      arrayOfChar2[n] = arrayOfChar1[(m & 0xF)];
      i += 1;
    }
    paramArrayOfByte = new String(arrayOfChar2);
    GMTrace.o(13864691302400L, 103300);
    return paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */