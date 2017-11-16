package com.tencent.mm.pluginsdk.j.a.d;

import com.tencent.gmtrace.GMTrace;

public final class l
{
  public final String eYU;
  public final long eYV;
  public final String filePath;
  final String groupId;
  public final int httpStatusCode;
  public final int status;
  public final String tpD;
  public final Exception tro;
  private final String url;
  
  public l(e parame, long paramLong, String paramString)
  {
    this(parame.SM(), parame.bJY(), parame.getURL(), parame.getFilePath(), paramLong, paramString, 2, null, -1);
    GMTrace.i(862617337856L, 6427);
    GMTrace.o(862617337856L, 6427);
  }
  
  public l(e parame, Exception paramException, int paramInt)
  {
    this(parame, paramException, -1, paramInt);
    GMTrace.i(14909307879424L, 111083);
    GMTrace.o(14909307879424L, 111083);
  }
  
  public l(e parame, Exception paramException, int paramInt1, int paramInt2)
  {
    this(parame.SM(), parame.bJY(), parame.getURL(), parame.getFilePath(), -1L, null, paramInt2, paramException, paramInt1);
    GMTrace.i(862751555584L, 6428);
    GMTrace.o(862751555584L, 6428);
  }
  
  public l(k paramk, long paramLong)
  {
    this(paramk.SM(), paramk.tpD, paramk.url, paramk.getFilePath(), paramLong, null, 2, null, -1);
    GMTrace.i(862483120128L, 6426);
    GMTrace.o(862483120128L, 6426);
  }
  
  private l(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5, int paramInt1, Exception paramException, int paramInt2)
  {
    GMTrace.i(862214684672L, 6424);
    this.groupId = paramString1;
    this.tpD = paramString2;
    this.url = paramString3;
    this.filePath = paramString4;
    this.eYV = paramLong;
    this.eYU = paramString5;
    this.status = paramInt1;
    this.tro = paramException;
    this.httpStatusCode = paramInt2;
    GMTrace.o(862214684672L, 6424);
  }
  
  public l(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5, Exception paramException)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramLong, paramString5, 3, paramException, -1);
    GMTrace.i(862348902400L, 6425);
    GMTrace.o(862348902400L, 6425);
  }
  
  public final String toString()
  {
    GMTrace.i(863019991040L, 6430);
    String str = "NetworkResponse{urlKey='" + this.tpD + '\'' + ", url='" + this.url + '\'' + ", filePath='" + this.filePath + '\'' + ", contentLength=" + this.eYV + ", contentType='" + this.eYU + '\'' + ", status=" + this.status + ", e=" + this.tro + '}';
    GMTrace.o(863019991040L, 6430);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */