package com.tencent.mm.plugin.appbrand.p.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public final class b
{
  public static CodingErrorAction iIE;
  
  static
  {
    GMTrace.i(10178938273792L, 75839);
    iIE = CodingErrorAction.REPORT;
    GMTrace.o(10178938273792L, 75839);
  }
  
  public static String m(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10178804056064L, 75838);
    Object localObject = Charset.forName("UTF8").newDecoder();
    ((CharsetDecoder)localObject).onMalformedInput(iIE);
    ((CharsetDecoder)localObject).onUnmappableCharacter(iIE);
    try
    {
      paramByteBuffer.mark();
      localObject = ((CharsetDecoder)localObject).decode(paramByteBuffer).toString();
      paramByteBuffer.reset();
      GMTrace.o(10178804056064L, 75838);
      return (String)localObject;
    }
    catch (CharacterCodingException paramByteBuffer)
    {
      throw new com.tencent.mm.plugin.appbrand.p.c.b(1007, paramByteBuffer);
    }
  }
  
  public static String q(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(10178669838336L, 75837);
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, 0, paramInt, "ASCII");
      GMTrace.o(10178669838336L, 75837);
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      w.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramArrayOfByte.toString());
      GMTrace.o(10178669838336L, 75837);
    }
    return "";
  }
  
  public static byte[] sH(String paramString)
  {
    GMTrace.i(10178401402880L, 75835);
    try
    {
      paramString = paramString.getBytes("UTF8");
      GMTrace.o(10178401402880L, 75835);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      w.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramString.toString());
      GMTrace.o(10178401402880L, 75835);
    }
    return new byte[0];
  }
  
  public static byte[] sI(String paramString)
  {
    GMTrace.i(10178535620608L, 75836);
    try
    {
      paramString = paramString.getBytes("ASCII");
      GMTrace.o(10178535620608L, 75836);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      w.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramString.toString());
      GMTrace.o(10178535620608L, 75836);
    }
    return new byte[0];
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */