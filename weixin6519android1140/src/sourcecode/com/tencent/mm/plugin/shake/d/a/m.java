package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class m
{
  public static final class a
  {
    public String path;
    public String thumbUrl;
    public String title;
    public String username;
    public int version;
    
    private a()
    {
      GMTrace.i(6603780653056L, 49202);
      GMTrace.o(6603780653056L, 49202);
    }
    
    public static a Gq(String paramString)
    {
      GMTrace.i(6603914870784L, 49203);
      Map localMap = bh.q(paramString, "program");
      if (localMap != null) {}
      for (;;)
      {
        try
        {
          paramString = new a();
          paramString.title = bg.nl((String)localMap.get(".program.title"));
          paramString.thumbUrl = bg.nl((String)localMap.get(".program.thumburl"));
          paramString.username = bg.nl((String)localMap.get(".program.username"));
          paramString.path = bg.nl((String)localMap.get(".program.path"));
          paramString.version = bg.getInt((String)localMap.get(".program.version"), 0);
          GMTrace.o(6603914870784L, 49203);
          return paramString;
        }
        catch (Exception paramString)
        {
          w.printErrStackTrace("MicroMsg.ShakeTVXmlParser", paramString, "", new Object[0]);
          paramString = null;
          continue;
        }
        paramString = null;
      }
    }
  }
  
  public static final class b
  {
    public String nFF;
    public String oOF;
    public String thumbUrl;
    public String title;
    
    private b()
    {
      GMTrace.i(6594653847552L, 49134);
      GMTrace.o(6594653847552L, 49134);
    }
    
    public static b Gr(String paramString)
    {
      GMTrace.i(6594788065280L, 49135);
      Map localMap = bh.q(paramString, "nativepay");
      if (localMap != null) {}
      for (;;)
      {
        try
        {
          paramString = new b();
          paramString.title = bg.nl((String)localMap.get(".nativepay.title"));
          paramString.thumbUrl = bg.nl((String)localMap.get(".nativepay.thumburl"));
          paramString.oOF = bg.nl((String)localMap.get(".nativepay.wx_pay_url"));
          paramString.nFF = bg.nl((String)localMap.get(".nativepay.price"));
          GMTrace.o(6594788065280L, 49135);
          return paramString;
        }
        catch (Exception paramString)
        {
          w.printErrStackTrace("MicroMsg.ShakeTVXmlParser", paramString, "", new Object[0]);
          paramString = null;
          continue;
        }
        paramString = null;
      }
    }
  }
  
  public static final class c
  {
    public String id;
    public String thumbUrl;
    public String title;
    
    private c()
    {
      GMTrace.i(6610491539456L, 49252);
      GMTrace.o(6610491539456L, 49252);
    }
    
    public static c Gs(String paramString)
    {
      GMTrace.i(6610625757184L, 49253);
      Map localMap = bh.q(paramString, "product");
      if (localMap != null) {}
      for (;;)
      {
        try
        {
          paramString = new c();
          paramString.title = bg.nl((String)localMap.get(".product.title"));
          paramString.thumbUrl = bg.nl((String)localMap.get(".product.thumburl"));
          paramString.id = bg.nl((String)localMap.get(".product.product_id"));
          GMTrace.o(6610625757184L, 49253);
          return paramString;
        }
        catch (Exception paramString)
        {
          w.printErrStackTrace("MicroMsg.ShakeTVXmlParser", paramString, "", new Object[0]);
          paramString = null;
          continue;
        }
        paramString = null;
      }
    }
  }
  
  public static final class d
  {
    public String oOG;
    public String thumbUrl;
    public String title;
    public String username;
    
    private d()
    {
      GMTrace.i(6608880926720L, 49240);
      GMTrace.o(6608880926720L, 49240);
    }
    
    public static d Gt(String paramString)
    {
      GMTrace.i(6609015144448L, 49241);
      Map localMap = bh.q(paramString, "tempsession");
      if (localMap != null) {}
      for (;;)
      {
        try
        {
          paramString = new d();
          paramString.title = bg.nl((String)localMap.get(".tempsession.title"));
          paramString.thumbUrl = bg.nl((String)localMap.get(".tempsession.thumburl"));
          paramString.username = bg.nl((String)localMap.get(".tempsession.username"));
          paramString.oOG = bg.nl((String)localMap.get(".tempsession.deeplinkjumpurl"));
          GMTrace.o(6609015144448L, 49241);
          return paramString;
        }
        catch (Exception paramString)
        {
          w.printErrStackTrace("MicroMsg.ShakeTVXmlParser", paramString, "", new Object[0]);
          paramString = null;
          continue;
        }
        paramString = null;
      }
    }
  }
  
  public static final class e
  {
    public String ePK;
    public String gVf;
    public String thumbUrl;
    public String title;
    
    private e()
    {
      GMTrace.i(6592103710720L, 49115);
      GMTrace.o(6592103710720L, 49115);
    }
    
    public static e Gu(String paramString)
    {
      GMTrace.i(6592237928448L, 49116);
      Map localMap = bh.q(paramString, "h5url");
      if (localMap != null) {}
      for (;;)
      {
        try
        {
          paramString = new e();
          paramString.title = bg.nl((String)localMap.get(".h5url.title"));
          paramString.thumbUrl = bg.nl((String)localMap.get(".h5url.thumburl"));
          paramString.gVf = bg.nl((String)localMap.get(".h5url.link"));
          paramString.ePK = bg.nl((String)localMap.get(".h5url.username"));
          GMTrace.o(6592237928448L, 49116);
          return paramString;
        }
        catch (Exception paramString)
        {
          w.printErrStackTrace("MicroMsg.ShakeTVXmlParser", paramString, "", new Object[0]);
          paramString = null;
          continue;
        }
        paramString = null;
      }
    }
  }
  
  public static final class f
  {
    public String aDn;
    public String oOH;
    public String userName;
    
    private f()
    {
      GMTrace.i(6605793918976L, 49217);
      GMTrace.o(6605793918976L, 49217);
    }
    
    public static f Gv(String paramString)
    {
      GMTrace.i(6605928136704L, 49218);
      Map localMap = bh.q(paramString, "bizprofile");
      if (localMap != null) {}
      for (;;)
      {
        try
        {
          paramString = new f();
          paramString.aDn = bg.nl((String)localMap.get(".bizprofile.nickname"));
          paramString.userName = bg.nl((String)localMap.get(".bizprofile.username"));
          paramString.oOH = bg.nl((String)localMap.get(".bizprofile.showchat"));
          GMTrace.o(6605928136704L, 49218);
          return paramString;
        }
        catch (Exception paramString)
        {
          w.printErrStackTrace("MicroMsg.ShakeTVXmlParser", paramString, "", new Object[0]);
          paramString = null;
          continue;
        }
        paramString = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */