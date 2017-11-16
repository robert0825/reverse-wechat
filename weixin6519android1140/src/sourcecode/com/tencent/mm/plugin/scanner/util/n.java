package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.k.d;
import com.tencent.mm.plugin.scanner.b;
import com.tencent.mm.plugin.scanner.ui.ProductUI;
import com.tencent.mm.plugin.scanner.ui.i;
import com.tencent.mm.plugin.scanner.ui.i.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;
import java.util.Map;

public final class n
{
  public static String E(Context paramContext, int paramInt)
  {
    GMTrace.i(6168646778880L, 45960);
    if ((paramContext == null) || (paramInt < 0))
    {
      GMTrace.o(6168646778880L, 45960);
      return "";
    }
    if (paramInt == 0) {
      paramContext.getString(R.l.dVN);
    }
    for (;;)
    {
      paramContext = paramContext.getString(R.l.dVN);
      GMTrace.o(6168646778880L, 45960);
      return paramContext;
      if (paramInt == 1) {
        paramContext.getString(R.l.dVG);
      } else if (paramInt == 2) {
        paramContext.getString(R.l.dVM);
      } else if (paramInt == 3) {
        paramContext.getString(R.l.dVH);
      }
    }
  }
  
  public static int FW(String paramString)
  {
    GMTrace.i(6168780996608L, 45961);
    if (paramString == null)
    {
      GMTrace.o(6168780996608L, 45961);
      return 0;
    }
    paramString = paramString.trim();
    if (paramString.startsWith("<user"))
    {
      GMTrace.o(6168780996608L, 45961);
      return 1;
    }
    if (paramString.startsWith("<url"))
    {
      GMTrace.o(6168780996608L, 45961);
      return 2;
    }
    if (paramString.startsWith("<product"))
    {
      GMTrace.o(6168780996608L, 45961);
      return 3;
    }
    if (paramString.startsWith("<search"))
    {
      GMTrace.o(6168780996608L, 45961);
      return 4;
    }
    GMTrace.o(6168780996608L, 45961);
    return 0;
  }
  
  public static c FX(String paramString)
  {
    GMTrace.i(6168915214336L, 45962);
    if (paramString == null)
    {
      GMTrace.o(6168915214336L, 45962);
      return null;
    }
    paramString = bh.q(paramString, "user");
    if (paramString == null)
    {
      GMTrace.o(6168915214336L, 45962);
      return null;
    }
    paramString = new c(bg.nl((String)paramString.get(".user.username")), bg.nl((String)paramString.get(".user.nickname")));
    GMTrace.o(6168915214336L, 45962);
    return paramString;
  }
  
  public static b FY(String paramString)
  {
    GMTrace.i(6169049432064L, 45963);
    if (paramString == null)
    {
      GMTrace.o(6169049432064L, 45963);
      return null;
    }
    paramString = bh.q(paramString, "url");
    if (paramString == null)
    {
      GMTrace.o(6169049432064L, 45963);
      return null;
    }
    paramString = new b(bg.nl((String)paramString.get(".url.link")));
    GMTrace.o(6169049432064L, 45963);
    return paramString;
  }
  
  public static int a(int paramInt1, String paramString, i parami, int paramInt2, e.a parama, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    GMTrace.i(6169317867520L, 45965);
    if ((parami == null) || (paramString == null) || (parami.bdc() == null) || (parami.bdc().bcT() == null))
    {
      if (paramString == null) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        w.e("MicroMsg.Scanner.ScanXmlHelper", "wrong args, xml == null ? [%s]", new Object[] { Boolean.valueOf(paramBoolean) });
        GMTrace.o(6169317867520L, 45965);
        return 2;
      }
    }
    int i = FW(paramString);
    w.d("MicroMsg.Scanner.ScanXmlHelper", "processReturnXml(), xmlType = [%s]", new Object[] { Integer.valueOf(i) });
    if (i == 1)
    {
      c localc = FX(paramString);
      if ((localc == null) || (bg.nm(localc.username)))
      {
        w.w("MicroMsg.Scanner.ScanXmlHelper", "xmlUser null");
        GMTrace.o(6169317867520L, 45965);
        return 2;
      }
      at.AR();
      paramString = c.yK().TE(localc.username);
      if ((paramString != null) && ((int)paramString.fTq > 0))
      {
        parama = new Intent();
        parama.putExtra("Contact_User", paramString.field_username);
        parama.setFlags(65536);
        b.hnH.d(parama, parami.bdc().bcT());
        GMTrace.o(6169317867520L, 45965);
        return 0;
      }
      parami.bdc().a(localc.username, 1, paramInt3, paramInt4, parama);
      GMTrace.o(6169317867520L, 45965);
      return 1;
    }
    if (i == 2)
    {
      paramString = FY(paramString);
      if ((paramString == null) || (bg.nm(paramString.gVf)))
      {
        w.w("MicroMsg.Scanner.ScanXmlHelper", "xmlurl null");
        GMTrace.o(6169317867520L, 45965);
        return 2;
      }
      w.d("MicroMsg.Scanner.ScanXmlHelper", "xmlurl.link: [%s]", new Object[] { paramString.gVf });
      if (paramInt1 == 5)
      {
        parama = (d)h.h(d.class);
        parami = parami.bdc().bcT();
        paramString = paramString.gVf;
        if (paramBoolean) {}
        for (paramInt1 = 1032;; paramInt1 = 1025)
        {
          parama.b(parami, paramString, paramInt1, null);
          GMTrace.o(6169317867520L, 45965);
          return 0;
        }
      }
      parama = new Intent();
      parama.putExtra("rawUrl", paramString.gVf);
      parama.setFlags(65536);
      b.hnH.j(parama, parami.bdc().bcT());
      GMTrace.o(6169317867520L, 45965);
      return 0;
    }
    if ((i == 3) || (i == 4))
    {
      w.d("MicroMsg.Scanner.ScanXmlHelper", "funcType = [%s], addProductToDB = [%s]", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(true) });
      parama = new Intent();
      parama.setClass(parami.bdc().bcT(), ProductUI.class);
      parama.setFlags(65536);
      parama.putExtra("key_Product_xml", paramString);
      parama.putExtra("key_Product_funcType", paramInt2);
      parama.putExtra("key_ProductUI_addToDB", true);
      parama.putExtra("key_need_add_to_history", true);
      parama.putExtra("key_is_from_barcode", true);
      parami.bdc().bcT().startActivity(parama);
      GMTrace.o(6169317867520L, 45965);
      return 0;
    }
    w.w("MicroMsg.Scanner.ScanXmlHelper", "wrong xmlType");
    w.v("MicroMsg.Scanner.ScanXmlHelper", "wrong xml : [%s]", new Object[] { paramString });
    GMTrace.o(6169317867520L, 45965);
    return 2;
  }
  
  public static String c(a parama)
  {
    GMTrace.i(6169183649792L, 45964);
    StringBuilder localStringBuilder = new StringBuilder(256);
    if (!bg.nm(parama.field_productid))
    {
      localStringBuilder.append("<productInfo><product type=\"" + parama.field_type + "\">");
      localStringBuilder.append("<id>" + bg.Sw(parama.field_productid) + "</id>");
      localStringBuilder.append("<title>" + bg.Sw(parama.field_title) + "</title>");
      localStringBuilder.append("<subtitle>" + bg.Sw(parama.field_subtitle) + "</subtitle>");
      localStringBuilder.append("<thumburl>" + bg.Sw(parama.field_thumburl) + "</thumburl>");
      localStringBuilder.append("<source>" + bg.Sw(parama.field_source) + "</source>");
      localStringBuilder.append("<shareurl>" + bg.Sw(parama.field_shareurl) + "</shareurl>");
      localStringBuilder.append("<playurl>" + bg.Sw(parama.field_playurl) + "</playurl>");
      localStringBuilder.append("<extinfo>" + bg.Sw(parama.field_extinfo) + "</extinfo>");
      localStringBuilder.append("<getaction>" + bg.Sw(new StringBuilder().append(parama.field_getaction).toString()) + "</getaction>");
      localStringBuilder.append("<certification>" + bg.Sw(new StringBuilder().append(parama.field_certification).toString()) + "</certification>");
      localStringBuilder.append("<headerbackgroundurl>" + bg.Sw(new StringBuilder().append(parama.field_headerbackgroundurl).toString()) + "</headerbackgroundurl>");
      localStringBuilder.append("<headermask>" + bg.Sw(new StringBuilder().append(parama.field_headermask).toString()) + "</headermask>");
      localStringBuilder.append("<detailurl>" + bg.Sw(new StringBuilder().append(parama.field_detailurl).toString()) + "</detailurl>");
      localStringBuilder.append("<certificationurl>" + bg.Sw(new StringBuilder().append(parama.field_certificationurl).toString()) + "</certificationurl>");
      localStringBuilder.append("</product>");
      localStringBuilder.append("<functionType>" + parama.field_functionType + "</functionType>");
      localStringBuilder.append("</productInfo>");
    }
    for (;;)
    {
      parama = localStringBuilder.toString();
      GMTrace.o(6169183649792L, 45964);
      return parama;
      if (parama.field_xml == null)
      {
        w.e("MicroMsg.Scanner.ScanXmlHelper", "product.field_xml == null in getProductInfoXml()");
        GMTrace.o(6169183649792L, 45964);
        return "";
      }
      if (parama.field_xml.startsWith("<productInfo"))
      {
        parama = parama.field_xml;
        GMTrace.o(6169183649792L, 45964);
        return parama;
      }
      localStringBuilder.append("<productInfo>");
      localStringBuilder.append(parama.field_xml);
      localStringBuilder.append("<functionType>" + parama.field_functionType + "</functionType>");
      localStringBuilder.append("</productInfo>");
    }
  }
  
  public static final class a
  {
    public String field_certification;
    public String field_certificationurl;
    public String field_detailurl;
    public String field_exposeurl;
    public String field_extinfo;
    public String field_feedbackurl;
    public int field_functionType;
    public int field_getaction;
    public String field_headerbackgroundurl;
    public String field_headermask;
    public String field_introlink;
    public String field_introtitle;
    public String field_playurl;
    public String field_productid;
    public String field_shareurl;
    public String field_source;
    public String field_subtitle;
    public String field_thumburl;
    public String field_title;
    public int field_type;
    public String field_xml;
    public int field_xmlType;
    public LinkedList<com.tencent.mm.plugin.scanner.a.a> oBs;
    public a oBt;
    
    public a()
    {
      GMTrace.i(6173881270272L, 45999);
      GMTrace.o(6173881270272L, 45999);
    }
    
    public final void l(Map<String, String> paramMap, String paramString)
    {
      GMTrace.i(6174015488000L, 46000);
      if (paramMap != null)
      {
        this.oBt = new a();
        this.oBt.oBu = new LinkedList();
        Object localObject2 = paramString + ".bannerlist.banner";
        int i = 0;
        Object localObject3;
        if (i < 1000)
        {
          localObject3 = new StringBuilder().append((String)localObject2);
          if (i > 0) {}
          for (localObject1 = Integer.valueOf(i);; localObject1 = "")
          {
            localObject1 = localObject1;
            localObject1 = (String)paramMap.get((String)localObject1 + ".link");
            if (bg.nm((String)localObject1)) {
              break label185;
            }
            localObject3 = new n.a.a.a();
            ((n.a.a.a)localObject3).gVf = ((String)localObject1);
            this.oBt.oBu.add(localObject3);
            i += 1;
            break;
          }
        }
        label185:
        this.oBt.oBv = new LinkedList();
        Object localObject1 = paramString + ".detaillist.detail";
        i = 0;
        if (i < 1000)
        {
          localObject2 = new StringBuilder().append((String)localObject1);
          if (i > 0) {}
          for (paramString = Integer.valueOf(i);; paramString = "")
          {
            localObject2 = paramString;
            paramString = (String)paramMap.get((String)localObject2 + ".title");
            localObject2 = (String)paramMap.get((String)localObject2 + ".desc");
            if ((bg.nm(paramString)) && (bg.nm((String)localObject2))) {
              break label387;
            }
            localObject3 = new n.a.a.b();
            ((n.a.a.b)localObject3).title = paramString;
            ((n.a.a.b)localObject3).desc = ((String)localObject2);
            this.oBt.oBv.add(localObject3);
            i += 1;
            break;
          }
        }
      }
      label387:
      GMTrace.o(6174015488000L, 46000);
    }
    
    public static final class a
    {
      public LinkedList<a> oBu;
      public LinkedList<b> oBv;
      
      public a()
      {
        GMTrace.i(6160593715200L, 45900);
        GMTrace.o(6160593715200L, 45900);
      }
      
      public static final class a
      {
        public String gVf;
        
        public a()
        {
          GMTrace.i(6169988956160L, 45970);
          GMTrace.o(6169988956160L, 45970);
        }
      }
      
      public static final class b
      {
        public String desc;
        public String title;
        
        public b()
        {
          GMTrace.i(6168512561152L, 45959);
          GMTrace.o(6168512561152L, 45959);
        }
      }
    }
  }
  
  public static final class b
  {
    public String gVf;
    
    public b(String paramString)
    {
      GMTrace.i(6160459497472L, 45899);
      this.gVf = paramString;
      GMTrace.o(6160459497472L, 45899);
    }
  }
  
  public static final class c
  {
    public String eCQ;
    public String username;
    
    public c(String paramString1, String paramString2)
    {
      GMTrace.i(6167573037056L, 45952);
      this.username = paramString1;
      this.eCQ = paramString2;
      GMTrace.o(6167573037056L, 45952);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */