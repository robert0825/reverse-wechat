package org.a.d;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.a.b.b;

class f
{
  private String charset;
  private HttpURLConnection hhh;
  private Map<String, String> iHJ;
  private String url;
  private j ytM;
  private e ytN;
  private e ytO;
  private String ytP = null;
  private byte[] ytQ = null;
  private boolean ytR = false;
  private Long ytS = null;
  private Long ytT = null;
  
  public f(j paramj, String paramString)
  {
    this.ytM = paramj;
    this.url = paramString;
    this.ytN = new e();
    this.ytO = new e();
    this.iHJ = new HashMap();
  }
  
  private byte[] ctD()
  {
    if (this.ytQ != null) {
      return this.ytQ;
    }
    if (this.ytP != null) {}
    for (Object localObject = this.ytP;; localObject = this.ytO.ctC()) {
      try
      {
        localObject = ((String)localObject).getBytes(cty());
        return (byte[])localObject;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new b("Unsupported Charset: " + cty(), localUnsupportedEncodingException);
      }
    }
  }
  
  private void f(HttpURLConnection paramHttpURLConnection)
  {
    Iterator localIterator = this.iHJ.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      String str = (String)localIterator.next();
      paramHttpURLConnection.setRequestProperty(str, (String)this.iHJ.get(str));
    }
  }
  
  public void addHeader(String paramString1, String paramString2)
  {
    this.iHJ.put(paramString1, paramString2);
  }
  
  public e ctA()
  {
    return this.ytO;
  }
  
  public String ctB()
  {
    return this.url.replaceAll("\\?.*", "").replace("\\:\\d{4}", "");
  }
  
  public e ctv()
  {
    try
    {
      e locale = new e();
      locale.Zm(new URL(this.url).getQuery());
      locale.a(this.ytN);
      return locale;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new b("Malformed URL", localMalformedURLException);
    }
  }
  
  public j ctw()
  {
    return this.ytM;
  }
  
  public String ctx()
  {
    Object localObject2 = this.ytN;
    Object localObject1 = this.url;
    org.a.g.d.e(localObject1, "Cannot append to null URL");
    localObject2 = ((e)localObject2).ctC();
    if (((String)localObject2).equals("")) {
      return (String)localObject1;
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject1));
    if (((String)localObject1).indexOf('?') != -1) {}
    for (localObject1 = "&";; localObject1 = Character.valueOf('?')) {
      return localStringBuilder.append(localObject1).toString() + (String)localObject2;
    }
  }
  
  public String cty()
  {
    if (this.charset == null) {
      return Charset.defaultCharset().name();
    }
    return this.charset;
  }
  
  /* Error */
  public g ctz()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 217	org/a/d/f:ctx	()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 219	org/a/d/f:hhh	Ljava/net/HttpURLConnection;
    //   9: ifnonnull +38 -> 47
    //   12: aload_0
    //   13: getfield 36	org/a/d/f:ytR	Z
    //   16: ifeq +188 -> 204
    //   19: ldc -35
    //   21: astore_1
    //   22: ldc -33
    //   24: aload_1
    //   25: invokestatic 228	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: pop
    //   29: aload_0
    //   30: new 154	java/net/URL
    //   33: dup
    //   34: aload_2
    //   35: invokespecial 155	java/net/URL:<init>	(Ljava/lang/String;)V
    //   38: invokevirtual 232	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   41: checkcast 123	java/net/HttpURLConnection
    //   44: putfield 219	org/a/d/f:hhh	Ljava/net/HttpURLConnection;
    //   47: aload_0
    //   48: getfield 219	org/a/d/f:hhh	Ljava/net/HttpURLConnection;
    //   51: aload_0
    //   52: getfield 42	org/a/d/f:ytM	Lorg/a/d/j;
    //   55: invokevirtual 235	org/a/d/j:name	()Ljava/lang/String;
    //   58: invokevirtual 238	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   61: aload_0
    //   62: getfield 38	org/a/d/f:ytS	Ljava/lang/Long;
    //   65: ifnull +17 -> 82
    //   68: aload_0
    //   69: getfield 219	org/a/d/f:hhh	Ljava/net/HttpURLConnection;
    //   72: aload_0
    //   73: getfield 38	org/a/d/f:ytS	Ljava/lang/Long;
    //   76: invokevirtual 244	java/lang/Long:intValue	()I
    //   79: invokevirtual 248	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   82: aload_0
    //   83: getfield 40	org/a/d/f:ytT	Ljava/lang/Long;
    //   86: ifnull +17 -> 103
    //   89: aload_0
    //   90: getfield 219	org/a/d/f:hhh	Ljava/net/HttpURLConnection;
    //   93: aload_0
    //   94: getfield 40	org/a/d/f:ytT	Ljava/lang/Long;
    //   97: invokevirtual 244	java/lang/Long:intValue	()I
    //   100: invokevirtual 251	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   103: aload_0
    //   104: aload_0
    //   105: getfield 219	org/a/d/f:hhh	Ljava/net/HttpURLConnection;
    //   108: invokespecial 253	org/a/d/f:f	(Ljava/net/HttpURLConnection;)V
    //   111: aload_0
    //   112: getfield 42	org/a/d/f:ytM	Lorg/a/d/j;
    //   115: getstatic 256	org/a/d/j:yub	Lorg/a/d/j;
    //   118: invokevirtual 257	org/a/d/j:equals	(Ljava/lang/Object;)Z
    //   121: ifne +16 -> 137
    //   124: aload_0
    //   125: getfield 42	org/a/d/f:ytM	Lorg/a/d/j;
    //   128: getstatic 260	org/a/d/j:yua	Lorg/a/d/j;
    //   131: invokevirtual 257	org/a/d/j:equals	(Ljava/lang/Object;)Z
    //   134: ifeq +58 -> 192
    //   137: aload_0
    //   138: getfield 219	org/a/d/f:hhh	Ljava/net/HttpURLConnection;
    //   141: astore_1
    //   142: aload_0
    //   143: invokespecial 262	org/a/d/f:ctD	()[B
    //   146: astore_2
    //   147: aload_1
    //   148: ldc_w 264
    //   151: aload_2
    //   152: arraylength
    //   153: invokestatic 267	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   156: invokevirtual 127	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: aload_1
    //   160: ldc_w 269
    //   163: invokevirtual 273	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   166: ifnonnull +13 -> 179
    //   169: aload_1
    //   170: ldc_w 269
    //   173: ldc_w 275
    //   176: invokevirtual 127	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: aload_1
    //   180: iconst_1
    //   181: invokevirtual 279	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   184: aload_1
    //   185: invokevirtual 283	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   188: aload_2
    //   189: invokevirtual 289	java/io/OutputStream:write	([B)V
    //   192: new 291	org/a/d/g
    //   195: dup
    //   196: aload_0
    //   197: getfield 219	org/a/d/f:hhh	Ljava/net/HttpURLConnection;
    //   200: invokespecial 293	org/a/d/g:<init>	(Ljava/net/HttpURLConnection;)V
    //   203: areturn
    //   204: ldc_w 295
    //   207: astore_1
    //   208: goto -186 -> 22
    //   211: astore_1
    //   212: new 297	org/a/b/a
    //   215: dup
    //   216: aload_1
    //   217: invokespecial 300	org/a/b/a:<init>	(Ljava/lang/Exception;)V
    //   220: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	221	0	this	f
    //   21	187	1	localObject1	Object
    //   211	6	1	localException	Exception
    //   4	185	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	19	211	java/lang/Exception
    //   22	47	211	java/lang/Exception
    //   47	82	211	java/lang/Exception
    //   82	103	211	java/lang/Exception
    //   103	137	211	java/lang/Exception
    //   137	179	211	java/lang/Exception
    //   179	192	211	java/lang/Exception
    //   192	204	211	java/lang/Exception
  }
  
  public void fO(String paramString1, String paramString2)
  {
    this.ytN.ytL.add(new d(paramString1, paramString2));
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public String toString()
  {
    return String.format("@Request(%s %s)", new Object[] { ctw(), getUrl() });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */