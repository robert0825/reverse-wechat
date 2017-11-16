package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

public final class f
  extends h
{
  public static final String BOUNDARY;
  private HttpPost nSf;
  
  static
  {
    GMTrace.i(5470446157824L, 40758);
    BOUNDARY = "WEIXIN" + System.currentTimeMillis();
    GMTrace.o(5470446157824L, 40758);
  }
  
  public f()
  {
    GMTrace.i(5469775069184L, 40753);
    GMTrace.o(5469775069184L, 40753);
  }
  
  private static String a(h.b paramb)
  {
    GMTrace.i(5470177722368L, 40756);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = paramb.nSp.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuilder.append("------" + BOUNDARY + "\r\n");
      localStringBuilder.append("Content-Disposition: form-data; name=\"" + str + "\"\r\n");
      localStringBuilder.append("\r\n");
      localStringBuilder.append((String)paramb.nSp.get(str));
      localStringBuilder.append("\r\n");
    }
    localObject = new File(paramb.nSr.filePath);
    if (!((File)localObject).isFile()) {
      throw new InvalidParameterException("The path to upload isnot a file.");
    }
    localObject = ((File)localObject).getName();
    localStringBuilder.append("------" + BOUNDARY + "\r\n");
    localStringBuilder.append("Content-Disposition: form-data; name=\"" + paramb.nSr.eJB + "\"; filename=\"" + (String)localObject + "\"\r\n");
    localStringBuilder.append("\r\n");
    paramb = localStringBuilder.toString();
    GMTrace.o(5470177722368L, 40756);
    return paramb;
  }
  
  public final h.c a(String paramString1, String paramString2, h.b paramb, h.a parama)
  {
    GMTrace.i(5469909286912L, 40754);
    w.d("MicroMsg.HttpClientUtil", "uri=" + paramString2 + ", " + paramb);
    int j = 0;
    parama = new DefaultHttpClient();
    int i = j;
    try
    {
      Object localObject = a(paramb);
      i = j;
      String str = paramb.nSr.filePath;
      i = j;
      StringBuilder localStringBuilder = new StringBuilder();
      i = j;
      localStringBuilder.append("\r\n");
      i = j;
      localStringBuilder.append("------" + BOUNDARY + "--\r\n");
      i = j;
      localObject = new a((String)localObject, str, localStringBuilder.toString());
      i = j;
      this.nSf = new HttpPost(c(paramString1, paramString2, paramb.nSp));
      i = j;
      this.nSf.setHeader("User-Agent", log);
      i = j;
      this.nSf.setHeader("Host", host);
      i = j;
      this.nSf.setHeader("Connection", "Keep-Alive");
      i = j;
      this.nSf.setHeader("Accept-Charset", "utf-8");
      i = j;
      this.nSf.setHeader("Cookie", G(paramb.nSq));
      i = j;
      this.nSf.setEntity((HttpEntity)localObject);
      i = j;
      paramb = parama.execute(this.nSf);
      i = j;
      j = paramb.getStatusLine().getStatusCode();
      i = j;
      paramString1 = paramb.getEntity();
      i = j;
      paramb = paramb.getFirstHeader("set-cookie").getValue();
      i = j;
      paramString1 = EntityUtils.toString(paramString1);
      i = j;
      paramString1 = new h.c(j, EV(paramb), paramString1);
      i = j;
      w.d("MicroMsg.HttpClientUtil", "uri=" + paramString2 + ", " + paramString1);
      parama.getConnectionManager().shutdown();
      GMTrace.o(5469909286912L, 40754);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.HttpClientUtil", paramString1, "", new Object[0]);
      j = i;
      if (i == 0) {
        j = 503;
      }
      paramString1 = new h.c(j, null, null);
      parama.getConnectionManager().shutdown();
      GMTrace.o(5469909286912L, 40754);
      return paramString1;
    }
    finally
    {
      parama.getConnectionManager().shutdown();
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(5470043504640L, 40755);
    w.d("MicroMsg.HttpClientUtil", "cancel conection.");
    if ((this.nSf != null) && (!this.nSf.isAborted())) {
      this.nSf.abort();
    }
    GMTrace.o(5470043504640L, 40755);
  }
  
  private final class a
    implements HttpEntity
  {
    private File file;
    private int length;
    private String nSg;
    private String nSh;
    
    public a(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(5467627585536L, 40737);
      this.nSg = paramString1;
      this.file = new File(paramString2);
      this.nSh = paramString3;
      this.length = (paramString1.length() + (int)this.file.length() + paramString3.length());
      GMTrace.o(5467627585536L, 40737);
    }
    
    public final void consumeContent()
    {
      GMTrace.i(5468835545088L, 40746);
      if (isStreaming()) {
        throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
      }
      GMTrace.o(5468835545088L, 40746);
    }
    
    public final InputStream getContent()
    {
      GMTrace.i(5468567109632L, 40744);
      throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }
    
    public final Header getContentEncoding()
    {
      GMTrace.i(5468432891904L, 40743);
      GMTrace.o(5468432891904L, 40743);
      return null;
    }
    
    public final long getContentLength()
    {
      GMTrace.i(5468164456448L, 40741);
      long l = this.length;
      GMTrace.o(5468164456448L, 40741);
      return l;
    }
    
    public final Header getContentType()
    {
      GMTrace.i(5468298674176L, 40742);
      BasicHeader localBasicHeader = new BasicHeader("Content-Type", "multipart/form-data; boundary=----" + f.BOUNDARY);
      GMTrace.o(5468298674176L, 40742);
      return localBasicHeader;
    }
    
    public final boolean isChunked()
    {
      GMTrace.i(5467896020992L, 40739);
      if (!isRepeatable())
      {
        GMTrace.o(5467896020992L, 40739);
        return true;
      }
      GMTrace.o(5467896020992L, 40739);
      return false;
    }
    
    public final boolean isRepeatable()
    {
      GMTrace.i(5467761803264L, 40738);
      GMTrace.o(5467761803264L, 40738);
      return true;
    }
    
    public final boolean isStreaming()
    {
      GMTrace.i(5468030238720L, 40740);
      if (!isRepeatable())
      {
        GMTrace.o(5468030238720L, 40740);
        return true;
      }
      GMTrace.o(5468030238720L, 40740);
      return false;
    }
    
    public final void writeTo(OutputStream paramOutputStream)
    {
      GMTrace.i(5468701327360L, 40745);
      paramOutputStream = new DataOutputStream(paramOutputStream);
      paramOutputStream.writeBytes(this.nSg);
      try
      {
        byte[] arrayOfByte = new byte['Ѐ'];
        localFileInputStream = new FileInputStream(this.file);
        try
        {
          for (;;)
          {
            int i = localFileInputStream.read(arrayOfByte);
            if (i <= 0) {
              break;
            }
            paramOutputStream.write(arrayOfByte, 0, i);
          }
          if (localFileInputStream == null) {
            break label75;
          }
        }
        finally {}
      }
      finally
      {
        for (;;)
        {
          FileInputStream localFileInputStream = null;
        }
      }
      localFileInputStream.close();
      label75:
      throw paramOutputStream;
      paramOutputStream.flush();
      localFileInputStream.close();
      paramOutputStream.writeBytes(this.nSh);
      GMTrace.o(5468701327360L, 40745);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */