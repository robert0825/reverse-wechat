package com.tencent.mm.x;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class f
  extends com.tencent.mm.g.b.o
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(312190435328L, 2326);
    c.a locala = new c.a();
    locala.gZM = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.vmt.put("msgId", "LONG default '0'  PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "msgId";
    locala.columns[1] = "xml";
    locala.vmt.put("xml", "TEXT");
    localStringBuilder.append(" xml TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "title";
    locala.vmt.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "description";
    locala.vmt.put("description", "TEXT");
    localStringBuilder.append(" description TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "source";
    locala.vmt.put("source", "TEXT");
    localStringBuilder.append(" source TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "type";
    locala.vmt.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    locala.columns[7] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    if (com.tencent.mm.sdk.a.b.bPq()) {
      Assert.assertTrue(yx());
    }
    GMTrace.o(312190435328L, 2326);
  }
  
  public f()
  {
    GMTrace.i(311921999872L, 2324);
    GMTrace.o(311921999872L, 2324);
  }
  
  private static final boolean yx()
  {
    GMTrace.i(16382079008768L, 122056);
    Field[] arrayOfField = a.class.getDeclaredFields();
    int i = 0;
    int k;
    for (int j = 0; i < arrayOfField.length; j = k)
    {
      k = j;
      if (!Modifier.isStatic(arrayOfField[i].getModifiers())) {
        k = j + 1;
      }
      i += 1;
    }
    if (j > 185)
    {
      w.e("MicroMsg.AppMessage", "AppMessage.Content should not add new field!!! (%d) is over the limit(%d)!!!", new Object[] { Integer.valueOf(j), Integer.valueOf(185) });
      GMTrace.o(16382079008768L, 122056);
      return false;
    }
    w.i("MicroMsg.AppMessage", "AppMessage.Content nonStaticFieldCount: %d", new Object[] { Integer.valueOf(j) });
    GMTrace.o(16382079008768L, 122056);
    return true;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(312056217600L, 2325);
    c.a locala = fTp;
    GMTrace.o(312056217600L, 2325);
    return locala;
  }
  
  public static class a
    extends c
  {
    private static final com.tencent.mm.a.f<Integer, a> gli;
    public String action;
    public String appId;
    public String appName;
    public String canvasPageXml;
    public String content;
    public String desc;
    public String description;
    public String designerName;
    public String designerRediretctUrl;
    public String eAE;
    public String eCU;
    public String eLl;
    public String eMI;
    public int eRQ;
    public String eTo;
    public String eTp;
    public String eTr;
    public String eTs;
    public String eTt;
    public String eTu;
    public String eTv;
    public int eVc;
    public String extInfo;
    public String filemd5;
    public String fwt;
    public int giA;
    public String giB;
    public String giC;
    public String giD;
    public int giE;
    public int giF;
    public int giG;
    public int giH;
    public int giI;
    public String giJ;
    public String giK;
    public int giL;
    public String giM;
    public String giN;
    public int giO;
    public int giP;
    public int giQ;
    public String giR;
    public String giS;
    public int giT;
    public String giU;
    public String giV;
    public int giW;
    public String giX;
    public String giY;
    public int giZ;
    public a gis;
    public Map<String, String> git;
    public String giu;
    public int giv;
    public String giw;
    public String gix;
    public int giy;
    public int giz;
    public String gjA;
    public int gjB;
    public int gjC;
    public String gjD;
    public String gjE;
    public int gjF;
    public int gjG;
    public int gjH;
    public String gjI;
    public String gjJ;
    public String gjK;
    public String gjL;
    public String gjM;
    public String gjN;
    public String gjO;
    public int gjP;
    public String gjQ;
    public String gjR;
    public String gjS;
    public String gjT;
    public String gjU;
    public String gjV;
    public String gjW;
    public String gjX;
    public String gjY;
    public String gjZ;
    public String gja;
    public String gjb;
    public String gjc;
    public String gjd;
    public String gje;
    public String gjf;
    public String gjg;
    public String gjh;
    public String gji;
    public String gjj;
    public String gjk;
    public String gjl;
    public String gjm;
    public String gjn;
    public String gjo;
    public int gjp;
    public int gjq;
    public int gjr;
    public String gjs;
    public String gjt;
    public String gju;
    public String gjv;
    public String gjw;
    public int gjx;
    public String gjy;
    public String gjz;
    public String gkA;
    public String gkB;
    public String gkC;
    public String gkD;
    public String gkE;
    public int gkF;
    public String gkG;
    public String gkH;
    public String gkI;
    public int gkJ;
    public String gkK;
    public String gkL;
    public String gkM;
    public String gkN;
    public String gkO;
    public String gkP;
    public String gkQ;
    public String gkR;
    public String gkS;
    public int gkT;
    public String gkU;
    public int gkV;
    public String gkW;
    public String gkX;
    public int gkY;
    public int gkZ;
    public String gka;
    public String gkb;
    public int gkc;
    public String gkd;
    public String gke;
    public String gkf;
    public int gkg;
    public boolean gkh;
    public int gki;
    public String gkj;
    public int gkk;
    public String gkl;
    public String gkm;
    public String gkn;
    public List<String> gko;
    public String gkp;
    public List<String> gkq;
    public String gkr;
    public int gks;
    public String gkt;
    public String gku;
    public String gkv;
    public String gkw;
    public String gkx;
    public String gky;
    public String gkz;
    public String gla;
    public String glb;
    public int glc;
    private final HashMap<Class<? extends c>, c> gld;
    public Map<String, String> gle;
    private String glf;
    private String glg;
    private String glh;
    public String iconUrl;
    public String mediaTagName;
    public String messageAction;
    public String messageExt;
    public int pageType;
    public int sdkVer;
    public String secondUrl;
    public int showType;
    public String thumburl;
    public int tid;
    public String title;
    public int type;
    public String url;
    public String username;
    
    static
    {
      GMTrace.i(315143225344L, 2348);
      gli = new com.tencent.mm.a.f(100);
      GMTrace.o(315143225344L, 2348);
    }
    
    public a()
    {
      GMTrace.i(313129959424L, 2333);
      this.gkh = false;
      this.gki = 0;
      this.gkJ = 0;
      this.gkK = "";
      this.gkL = "";
      this.gkM = "";
      this.gkN = "";
      this.gkO = "";
      this.gkP = "";
      this.canvasPageXml = "";
      this.glb = null;
      this.glc = 0;
      this.gld = new HashMap();
      GMTrace.o(313129959424L, 2333);
    }
    
    public static final a C(String paramString1, String paramString2)
    {
      GMTrace.i(313398394880L, 2335);
      if (bg.nm(paramString1))
      {
        GMTrace.o(313398394880L, 2335);
        return null;
      }
      int i = paramString1.indexOf('<');
      if (i > 0) {}
      for (Object localObject2 = paramString1.substring(i);; localObject2 = paramString1)
      {
        i = ((String)localObject2).hashCode();
        Object localObject1 = (a)gli.get(Integer.valueOf(i));
        if (localObject1 != null)
        {
          GMTrace.o(313398394880L, 2335);
          return (a)localObject1;
        }
        long l1 = System.currentTimeMillis();
        localObject1 = null;
        if (!bg.nm(paramString2)) {
          localObject1 = aw.Se(paramString2);
        }
        if (localObject1 == null) {
          localObject1 = bh.q((String)localObject2, "msg");
        }
        for (;;)
        {
          if (localObject1 == null)
          {
            w.e("MicroMsg.AppMessage", "parse msg failed");
            GMTrace.o(313398394880L, 2335);
            return null;
          }
          long l2 = System.currentTimeMillis();
          a locala = new a();
          locala.gle = ((Map)localObject1);
          locala.glf = paramString1;
          locala.glg = ((String)localObject2);
          locala.glh = paramString2;
          try
          {
            locala.a((Map)localObject1, locala);
            paramString1 = f.b.glp.iterator();
            while (paramString1.hasNext())
            {
              localObject2 = (c)((com.tencent.mm.bz.b)paramString1.next()).get();
              ((c)localObject2).a((Map)localObject1, locala);
              locala.a((c)localObject2);
            }
            paramString1 = f.b.fn(locala.type);
          }
          catch (Exception paramString1)
          {
            w.e("MicroMsg.AppMessage", "parse amessage xml failed");
            w.e("MicroMsg.AppMessage", "exception:%s", new Object[] { bg.f(paramString1) });
            GMTrace.o(313398394880L, 2335);
            return null;
          }
          if (paramString1 != null)
          {
            paramString1.a((Map)localObject1, locala);
            locala.a(paramString1);
          }
          gli.m(Integer.valueOf(i), locala);
          w.d("MicroMsg.AppMessage", "parseContent, time:%d, %d, %d", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(System.currentTimeMillis() - l1), Integer.valueOf(bg.nl(paramString2).hashCode()) });
          GMTrace.o(313398394880L, 2335);
          return locala;
        }
      }
    }
    
    public static a a(a parama)
    {
      GMTrace.i(314337918976L, 2342);
      if (parama == null)
      {
        parama = new a();
        GMTrace.o(314337918976L, 2342);
        return parama;
      }
      parama = parama.yy();
      GMTrace.o(314337918976L, 2342);
      return parama;
    }
    
    public static String a(a parama, String paramString, keep_SceneResult paramkeep_SceneResult)
    {
      GMTrace.i(14623692554240L, 108955);
      w.i("MicroMsg.AppMessage", "summersafecdn makeLocalContent aesKey[%s], filemd5[%s]", new Object[] { bg.SJ(parama.giJ), parama.filemd5 });
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<msg>");
      if ((parama.giI != 0) && (parama.giH != 0))
      {
        w.d("MicroMsg.AppMessage", "summersafecdn makeLocalContent thumb[%d, %d]", new Object[] { Integer.valueOf(parama.giI), Integer.valueOf(parama.giH) });
        localStringBuilder.append(a(parama, paramString, paramkeep_SceneResult, parama.giI, parama.giH));
      }
      for (;;)
      {
        localStringBuilder.append("</msg>");
        gli.m(Integer.valueOf(localStringBuilder.toString().hashCode()), parama);
        parama = localStringBuilder.toString();
        GMTrace.o(14623692554240L, 108955);
        return parama;
        w.d("MicroMsg.AppMessage", "summersafecdn makeLocalContent thumb 0");
        localStringBuilder.append(a(parama, paramString, paramkeep_SceneResult, 0, 0));
      }
    }
    
    public static String a(a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
    {
      GMTrace.i(314606354432L, 2344);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<appmsg appid=\"" + bg.Sw(parama.appId) + "\" sdkver=\"" + parama.sdkVer + "\">");
      parama.a(localStringBuilder, parama, paramString, paramkeep_SceneResult, paramInt1, paramInt2);
      c localc = f.b.fn(parama.type);
      if (localc != null) {
        localc.a(localStringBuilder, parama, paramString, paramkeep_SceneResult, paramInt1, paramInt2);
      }
      localStringBuilder.append("</appmsg>");
      if (2 == parama.showType) {
        localStringBuilder.append("<ShakePageResult>").append(parama.giB).append("</ShakePageResult>");
      }
      w.d("MicroMsg.AppMessage", "summerbig makeContent[%s]", new Object[] { localStringBuilder.toString() });
      parama = localStringBuilder.toString();
      GMTrace.o(314606354432L, 2344);
      return parama;
    }
    
    public static final a eS(String paramString)
    {
      GMTrace.i(313264177152L, 2334);
      paramString = C(paramString, null);
      GMTrace.o(313264177152L, 2334);
      return paramString;
    }
    
    public static String eT(String paramString)
    {
      GMTrace.i(314874789888L, 2346);
      paramString = "<![CDATA[" + paramString + "]]>";
      GMTrace.o(314874789888L, 2346);
      return paramString;
    }
    
    private a yy()
    {
      GMTrace.i(16383421186048L, 122066);
      a locala = new a();
      if (this == null)
      {
        GMTrace.o(16383421186048L, 122066);
        return locala;
      }
      w.i("MicroMsg.AppMessage", "summerbig cloneContent srcContent aesKey[%s], filemd5[%s], appid[%s]", new Object[] { bg.SJ(this.giJ), this.filemd5, locala.appId });
      locala.action = this.action;
      locala.appId = this.appId;
      locala.appName = this.appName;
      locala.eVc = this.eVc;
      locala.eAE = this.eAE;
      locala.giv = this.giv;
      locala.content = this.content;
      locala.description = this.description;
      locala.username = this.username;
      locala.extInfo = this.extInfo;
      locala.mediaTagName = this.mediaTagName;
      locala.messageAction = this.messageAction;
      locala.messageExt = this.messageExt;
      locala.giy = this.giy;
      locala.giw = this.giw;
      locala.eMI = this.eMI;
      locala.giu = this.giu;
      locala.sdkVer = this.sdkVer;
      locala.title = this.title;
      locala.type = this.type;
      locala.showType = this.showType;
      locala.giO = this.giO;
      locala.giP = this.giP;
      locala.url = this.url;
      locala.gix = this.gix;
      locala.eTo = this.eTo;
      locala.eTp = this.eTp;
      locala.fwt = this.fwt;
      locala.thumburl = this.thumburl;
      locala.giB = this.giB;
      locala.giM = this.giM;
      locala.giN = this.giN;
      locala.giQ = this.giQ;
      locala.giR = this.giR;
      locala.giT = this.giT;
      locala.giS = this.giS;
      locala.giW = this.giW;
      locala.giX = this.giX;
      locala.giZ = this.giZ;
      locala.giY = this.giY;
      locala.giU = this.giU;
      locala.giV = this.giV;
      locala.gjw = this.gjw;
      locala.eLl = this.eLl;
      locala.gjD = this.gjD;
      locala.gjE = this.gjE;
      locala.gjF = this.gjF;
      locala.gjG = this.gjF;
      locala.gjy = this.gjy;
      locala.gjB = this.gjB;
      locala.gjx = this.gjx;
      locala.gjz = this.gjz;
      locala.gjA = this.gjA;
      locala.gjP = this.gjP;
      locala.gjQ = this.gjQ;
      locala.gjR = this.gjR;
      locala.giA = this.giA;
      locala.eTr = this.eTr;
      locala.eTs = this.eTs;
      locala.eTt = this.eTt;
      locala.eTu = this.eTu;
      locala.gkH = this.gkH;
      locala.gkF = this.gkF;
      locala.designerName = this.designerName;
      locala.designerRediretctUrl = this.designerName;
      locala.tid = this.tid;
      locala.gkG = this.gkG;
      locala.desc = this.desc;
      locala.iconUrl = this.iconUrl;
      locala.secondUrl = this.secondUrl;
      locala.pageType = this.pageType;
      locala.gkI = this.gkI;
      locala.gkJ = this.gkJ;
      locala.gkK = this.gkK;
      locala.gkL = this.gkL;
      locala.gkM = this.gkM;
      locala.gkN = this.gkN;
      locala.gkO = this.gkO;
      locala.gkP = this.gkP;
      locala.canvasPageXml = this.canvasPageXml;
      locala.eTv = this.eTv;
      locala.giC = this.giC;
      locala.giJ = this.giJ;
      locala.filemd5 = this.filemd5;
      locala.giz = this.giz;
      locala.gis = this.gis;
      locala.gkQ = this.gkQ;
      locala.gkR = this.gkR;
      locala.gkT = this.gkT;
      locala.gkU = this.gkU;
      locala.gkY = this.gkY;
      locala.gkS = this.gkS;
      locala.gkZ = this.gkZ;
      locala.gla = this.gla;
      locala.gkW = this.gkW;
      locala.glg = this.glg;
      locala.glh = this.glh;
      locala.glf = this.glf;
      locala.gle = this.gle;
      Iterator localIterator = this.gld.entrySet().iterator();
      while (localIterator.hasNext())
      {
        c localc = ((c)((Map.Entry)localIterator.next()).getValue()).yw();
        if (localc != null) {
          locala.a(localc);
        }
      }
      GMTrace.o(16383421186048L, 122066);
      return locala;
    }
    
    public final void a(c paramc)
    {
      GMTrace.i(16383152750592L, 122064);
      if (paramc == null)
      {
        w.printErrStackTrace("MicroMsg.AppMessage", new NullPointerException(""), "piece is null", new Object[0]);
        GMTrace.o(16383152750592L, 122064);
        return;
      }
      paramc.giq = this;
      this.gld.put(paramc.getClass(), paramc);
      GMTrace.o(16383152750592L, 122064);
    }
    
    public final void a(f paramf)
    {
      GMTrace.i(314740572160L, 2345);
      paramf.field_appId = this.appId;
      paramf.field_title = this.title;
      paramf.field_description = this.description;
      paramf.field_type = this.type;
      paramf.field_source = this.appName;
      GMTrace.o(314740572160L, 2345);
    }
    
    public final void a(StringBuilder paramStringBuilder, a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
    {
      GMTrace.i(16383555403776L, 122067);
      paramStringBuilder.append("<title>" + bg.Sw(parama.title) + "</title>");
      paramStringBuilder.append("<des>" + bg.Sw(parama.description) + "</des>");
      paramStringBuilder.append("<username>" + bg.Sw(parama.username) + "</username>");
      Object localObject2 = new StringBuilder("<action>");
      Object localObject1;
      if (bg.nm(parama.action))
      {
        localObject1 = "view";
        paramStringBuilder.append((String)localObject1 + "</action>");
        paramStringBuilder.append("<type>" + parama.type + "</type>");
        paramStringBuilder.append("<showtype>").append(parama.showType).append("</showtype>");
        paramStringBuilder.append("<content>" + bg.Sw(parama.content) + "</content>");
        paramStringBuilder.append("<url>" + bg.Sw(parama.url) + "</url>");
        paramStringBuilder.append("<lowurl>" + bg.Sw(parama.giu) + "</lowurl>");
        paramStringBuilder.append("<dataurl>" + bg.Sw(parama.giM) + "</dataurl>");
        paramStringBuilder.append("<lowdataurl>" + bg.Sw(parama.giN) + "</lowdataurl>");
        paramStringBuilder.append("<contentattr>").append(parama.giA).append("</contentattr>");
        paramStringBuilder.append("<streamvideo>");
        paramStringBuilder.append("<streamvideourl>").append(bg.Sw(parama.gkI)).append("</streamvideourl>");
        paramStringBuilder.append("<streamvideototaltime>").append(parama.gkJ).append("</streamvideototaltime>");
        paramStringBuilder.append("<streamvideotitle>").append(bg.Sw(parama.gkK)).append("</streamvideotitle>");
        paramStringBuilder.append("<streamvideowording>").append(bg.Sw(parama.gkL)).append("</streamvideowording>");
        paramStringBuilder.append("<streamvideoweburl>").append(bg.Sw(parama.gkM)).append("</streamvideoweburl>");
        paramStringBuilder.append("<streamvideothumburl>").append(bg.Sw(parama.gkN)).append("</streamvideothumburl>");
        paramStringBuilder.append("<streamvideoaduxinfo>").append(bg.Sw(parama.gkO)).append("</streamvideoaduxinfo>");
        paramStringBuilder.append("<streamvideopublishid>").append(bg.Sw(parama.gkP)).append("</streamvideopublishid>");
        paramStringBuilder.append("</streamvideo>");
        paramStringBuilder.append(String.format("<canvasPageItem><canvasPageXml><![CDATA[%s]]></canvasPageXml></canvasPageItem>", new Object[] { parama.canvasPageXml }));
        switch (parama.type)
        {
        }
      }
      for (;;)
      {
        paramStringBuilder.append("<appattach>");
        if ((paramkeep_SceneResult != null) && ((!bg.nm(paramString)) || (paramInt1 != 0) || (paramInt2 != 0))) {
          break label3279;
        }
        paramStringBuilder.append("<totallen>" + parama.giv + "</totallen>");
        paramStringBuilder.append("<attachid>" + bg.Sw(parama.eAE) + "</attachid>");
        paramStringBuilder.append("<cdnattachurl>" + bg.Sw(parama.giC) + "</cdnattachurl>");
        paramStringBuilder.append("<emoticonmd5>" + bg.Sw(parama.gix) + "</emoticonmd5>");
        paramStringBuilder.append("<aeskey>" + bg.Sw(parama.giJ) + "</aeskey>");
        if ((paramInt1 != 0) && (paramInt2 != 0))
        {
          paramStringBuilder.append("<thumbheight>" + paramInt2 + "</thumbheight>");
          paramStringBuilder.append("<thumbwidth>" + paramInt1 + "</thumbwidth>");
        }
        paramStringBuilder.append("<fileext>" + bg.Sw(parama.giw) + "</fileext>");
        paramStringBuilder.append("<islargefilemsg>" + parama.giz + "</islargefilemsg>");
        paramStringBuilder.append("</appattach>");
        paramStringBuilder.append("<extinfo>" + bg.Sw(parama.extInfo) + "</extinfo>");
        paramStringBuilder.append("<androidsource>" + parama.giy + "</androidsource>");
        if (!bg.nm(parama.eTo))
        {
          paramStringBuilder.append("<sourceusername>" + bg.Sw(parama.eTo) + "</sourceusername>");
          paramStringBuilder.append("<sourcedisplayname>" + bg.Sw(parama.eTp) + "</sourcedisplayname>");
          paramStringBuilder.append("<commenturl>" + bg.Sw(parama.fwt) + "</commenturl>");
        }
        paramStringBuilder.append("<thumburl>" + bg.Sw(parama.thumburl) + "</thumburl>");
        paramStringBuilder.append("<mediatagname>" + bg.Sw(parama.mediaTagName) + "</mediatagname>");
        paramStringBuilder.append("<messageaction>" + eT(bg.Sw(parama.messageAction)) + "</messageaction>");
        paramStringBuilder.append("<messageext>" + eT(bg.Sw(parama.messageExt)) + "</messageext>");
        paramStringBuilder.append("<emoticongift>");
        paramStringBuilder.append("<packageflag>" + parama.giT + "</packageflag>");
        paramStringBuilder.append("<packageid>" + bg.Sw(parama.giS) + "</packageid>");
        paramStringBuilder.append("</emoticongift>");
        paramStringBuilder.append("<emoticonshared>");
        paramStringBuilder.append("<packageflag>" + parama.giZ + "</packageflag>");
        paramStringBuilder.append("<packageid>" + bg.Sw(parama.giY) + "</packageid>");
        paramStringBuilder.append("</emoticonshared>");
        paramStringBuilder.append("<designershared>");
        paramStringBuilder.append("<designeruin>" + parama.gkF + "</designeruin>");
        paramStringBuilder.append("<designername>" + parama.designerName + "</designername>");
        paramStringBuilder.append("<designerrediretcturl>" + parama.designerRediretctUrl + "</designerrediretcturl>");
        paramStringBuilder.append("</designershared>");
        paramStringBuilder.append("<emotionpageshared>");
        paramStringBuilder.append("<tid>" + parama.tid + "</tid>");
        paramStringBuilder.append("<title>" + parama.gkG + "</title>");
        paramStringBuilder.append("<desc>" + parama.desc + "</desc>");
        paramStringBuilder.append("<iconUrl>" + parama.iconUrl + "</iconUrl>");
        paramStringBuilder.append("<secondUrl>" + parama.secondUrl + "</secondUrl>");
        paramStringBuilder.append("<pageType>" + parama.pageType + "</pageType>");
        paramStringBuilder.append("</emotionpageshared>");
        paramStringBuilder.append("<webviewshared>");
        paramStringBuilder.append("<shareUrlOriginal>" + bg.Sw(parama.eTr) + "</shareUrlOriginal>");
        paramStringBuilder.append("<shareUrlOpen>" + bg.Sw(parama.eTs) + "</shareUrlOpen>");
        paramStringBuilder.append("<jsAppId>" + bg.Sw(parama.eTt) + "</jsAppId>");
        paramStringBuilder.append("<publisherId>" + bg.Sw(parama.eTu) + "</publisherId>");
        paramStringBuilder.append("</webviewshared>");
        paramStringBuilder.append("<template_id>" + bg.Sw(parama.gjw) + "</template_id>");
        w.i("MicroMsg.AppMessage", "summerbig makecontent content md5[%s]", new Object[] { parama.filemd5 });
        paramStringBuilder.append("<md5>" + bg.Sw(parama.filemd5) + "</md5>");
        Iterator localIterator = f.b.glp.iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (c)((com.tencent.mm.bz.b)localIterator.next()).get();
          localObject2 = parama.n(localObject1.getClass());
          if (localObject2 != null) {
            localObject1 = localObject2;
          }
          ((c)localObject1).a(paramStringBuilder, parama, paramString, paramkeep_SceneResult, paramInt1, paramInt2);
        }
        localObject1 = bg.Sw(parama.action);
        break;
        paramStringBuilder.append("<productitem type=\"" + parama.giQ + "\">");
        paramStringBuilder.append("<productinfo>" + bg.Sw(parama.giR) + "</productinfo>");
        paramStringBuilder.append("</productitem>");
        continue;
        paramStringBuilder.append("<mallproductitem type=\"" + parama.giW + "\">");
        paramStringBuilder.append("<mallproductinfo>" + bg.Sw(parama.giX) + "</mallproductinfo>");
        paramStringBuilder.append("</mallproductitem>");
        continue;
        paramStringBuilder.append("<tvinfo>" + bg.Sw(parama.giU) + "</tvinfo>");
        continue;
        paramStringBuilder.append("<recorditem>" + bg.Sw(parama.giV) + "</recorditem>");
        continue;
        paramStringBuilder.append("<carditem>" + parama.gjD + "</carditem>");
        continue;
        paramStringBuilder.append("<wcpayinfo>");
        paramStringBuilder.append("<paysubtype>" + parama.gjx + "</paysubtype>");
        paramStringBuilder.append("<feedesc>" + parama.gjy + "</feedesc>");
        paramStringBuilder.append("<transcationid>" + parama.gjz + "</transcationid>");
        paramStringBuilder.append("<transferid>" + parama.gjA + "</transferid>");
        paramStringBuilder.append("<invalidtime>" + parama.gjB + "</invalidtime>");
        paramStringBuilder.append("<pay_memo>" + parama.gkH + "</pay_memo>");
        paramStringBuilder.append("</wcpayinfo>");
        continue;
        paramStringBuilder.append("<wcpayinfo>");
        paramStringBuilder.append("<iconurl>" + bg.Sw(parama.gjT) + "</iconurl>");
        paramStringBuilder.append("<scenetext>" + bg.Sw(parama.gjY) + "</scenetext>");
        paramStringBuilder.append("<url>" + bg.Sw(parama.gjS) + "</url>");
        paramStringBuilder.append("<receivertitle>" + bg.Sw(parama.gjU) + "</receivertitle>");
        paramStringBuilder.append("<sendertitle>" + bg.Sw(parama.gjV) + "</sendertitle>");
        paramStringBuilder.append("<receiverdes>" + bg.Sw(parama.gjX) + "</receiverdes>");
        paramStringBuilder.append("<senderdes>" + bg.Sw(parama.gjW) + "</senderdes>");
        paramStringBuilder.append("<templateid>" + bg.Sw(parama.gjZ) + "</templateid>");
        paramStringBuilder.append("<sceneid>" + bg.Sw(parama.gka) + "</sceneid>");
        paramStringBuilder.append("<nativeurl>" + bg.Sw(parama.gkb) + "</nativeurl>");
        paramStringBuilder.append("<innertype>" + bg.Sw(new StringBuilder().append(parama.showType).toString()) + "</innertype>");
        paramStringBuilder.append("<localtype>" + bg.Sw(new StringBuilder().append(parama.gkc).toString()) + "</localtype>");
        paramStringBuilder.append("<paymsgid>" + bg.Sw(parama.gkd) + "</paymsgid>");
        paramStringBuilder.append("<imageid>" + bg.Sw(parama.gke) + "</imageid>");
        paramStringBuilder.append("<imageaeskey>" + bg.Sw(parama.gkf) + "</imageaeskey>");
        paramStringBuilder.append("<imagelength>" + bg.Sw(new StringBuilder().append(parama.gkg).toString()) + "</imagelength>");
        paramStringBuilder.append("<droptips>" + bg.Sw(new StringBuilder().append(parama.gki).toString()) + "</droptips>");
        paramStringBuilder.append("</wcpayinfo>");
      }
      label3279:
      paramStringBuilder.append("<attachid>" + bg.Sw(paramString) + "</attachid>");
      if ((paramkeep_SceneResult.field_fileLength > 0) && (!bg.nm(paramkeep_SceneResult.field_fileId)))
      {
        paramStringBuilder.append("<cdnattachurl>" + bg.Sw(paramkeep_SceneResult.field_fileId) + "</cdnattachurl>");
        if ((parama.type == 19) || (parama.type == 24) || (parama.type == 4) || (parama.type == 3) || (parama.type == 7) || (parama.type == 27) || (parama.type == 26)) {
          break label3711;
        }
        paramStringBuilder.append("<totallen>" + paramkeep_SceneResult.field_fileLength + "</totallen>");
      }
      for (;;)
      {
        if (paramkeep_SceneResult.field_thumbimgLength > 0)
        {
          paramStringBuilder.append("<cdnthumburl>" + bg.Sw(paramkeep_SceneResult.field_fileId) + "</cdnthumburl>");
          if (!bg.nm(paramkeep_SceneResult.field_thumbfilemd5)) {
            paramStringBuilder.append("<cdnthumbmd5>" + paramkeep_SceneResult.field_thumbfilemd5 + "</cdnthumbmd5>");
          }
          paramStringBuilder.append("<cdnthumblength>" + paramkeep_SceneResult.field_thumbimgLength + "</cdnthumblength>");
          paramStringBuilder.append("<cdnthumbheight>" + paramInt2 + "</cdnthumbheight>");
          paramStringBuilder.append("<cdnthumbwidth>" + paramInt1 + "</cdnthumbwidth>");
          paramStringBuilder.append("<cdnthumbaeskey>" + paramkeep_SceneResult.field_aesKey + "</cdnthumbaeskey>");
        }
        paramStringBuilder.append("<aeskey>" + bg.Sw(paramkeep_SceneResult.field_aesKey) + "</aeskey>");
        paramStringBuilder.append("<encryver>1</encryver>");
        break;
        label3711:
        w.i("MicroMsg.AppMessage", "summersafecdn content.type[%d], len[%d] but not set", new Object[] { Integer.valueOf(parama.type), Integer.valueOf(paramkeep_SceneResult.field_fileLength) });
      }
      GMTrace.o(16383555403776L, 122067);
    }
    
    public final void a(Map<String, String> paramMap, a parama)
    {
      GMTrace.i(16383286968320L, 122065);
      for (;;)
      {
        int i;
        int j;
        try
        {
          this.git = paramMap;
          this.appId = ((String)paramMap.get(".msg.appmsg.$appid"));
          this.sdkVer = bg.getInt((String)paramMap.get(".msg.appmsg.$sdkver"), 0);
          this.title = bg.Sf((String)paramMap.get(".msg.appmsg.title"));
          this.description = ((String)paramMap.get(".msg.appmsg.des"));
          this.username = ((String)paramMap.get(".msg.appmsg.username"));
          this.action = ((String)paramMap.get(".msg.appmsg.action"));
          this.type = bg.getInt((String)paramMap.get(".msg.appmsg.type"), 0);
          this.content = ((String)paramMap.get(".msg.appmsg.content"));
          this.url = ((String)paramMap.get(".msg.appmsg.url"));
          this.giu = ((String)paramMap.get(".msg.appmsg.lowurl"));
          this.giM = ((String)paramMap.get(".msg.appmsg.dataurl"));
          this.giN = ((String)paramMap.get(".msg.appmsg.lowdataurl"));
          this.giv = bg.getInt((String)paramMap.get(".msg.appmsg.appattach.totallen"), 0);
          this.eAE = ((String)paramMap.get(".msg.appmsg.appattach.attachid"));
          this.giw = bg.Sf((String)paramMap.get(".msg.appmsg.appattach.fileext"));
          this.gix = ((String)paramMap.get(".msg.appmsg.appattach.emoticonmd5"));
          this.extInfo = ((String)paramMap.get(".msg.appmsg.extinfo"));
          this.giy = bg.getInt((String)paramMap.get(".msg.appmsg.androidsource"), 0);
          this.eTo = ((String)paramMap.get(".msg.appmsg.sourceusername"));
          this.eTp = ((String)paramMap.get(".msg.appmsg.sourcedisplayname"));
          this.fwt = ((String)paramMap.get(".msg.commenturl"));
          this.thumburl = ((String)paramMap.get(".msg.appmsg.thumburl"));
          this.mediaTagName = ((String)paramMap.get(".msg.appmsg.mediatagname"));
          this.messageAction = ((String)paramMap.get(".msg.appmsg.messageaction"));
          this.messageExt = ((String)paramMap.get(".msg.appmsg.messageext"));
          this.eVc = bg.getInt((String)paramMap.get(".msg.appinfo.version"), 0);
          this.appName = ((String)paramMap.get(".msg.appinfo.appname"));
          this.eMI = ((String)paramMap.get(".msg.fromusername"));
          this.giC = ((String)paramMap.get(".msg.appmsg.appattach.cdnattachurl"));
          this.giD = ((String)paramMap.get(".msg.appmsg.appattach.cdnthumburl"));
          this.giE = bg.getInt((String)paramMap.get(".msg.appmsg.appattach.cdnthumblength"), 0);
          this.giF = bg.getInt((String)paramMap.get(".msg.appmsg.appattach.cdnthumbheight"), 0);
          this.giG = bg.getInt((String)paramMap.get(".msg.appmsg.appattach.cdnthumbwidth"), 0);
          this.giH = bg.getInt((String)paramMap.get(".msg.appmsg.appattach.thumbheight"), 0);
          this.giI = bg.getInt((String)paramMap.get(".msg.appmsg.appattach.thumbwidth"), 0);
          this.giJ = ((String)paramMap.get(".msg.appmsg.appattach.aeskey"));
          this.giL = bg.getInt((String)paramMap.get(".msg.appmsg.appattach.encryver"), 1);
          this.giK = ((String)paramMap.get(".msg.appmsg.appattach.cdnthumbaeskey"));
          this.giz = bg.getInt((String)paramMap.get(".msg.appmsg.appattach.islargefilemsg"), 0);
          if ((this.giz == 0) && (this.giv > 26214400))
          {
            this.giz = 1;
            w.i("MicroMsg.AppMessage", "summerbig content.attachlen[%d] set largefilemsg 1", new Object[] { Integer.valueOf(this.giv) });
          }
          this.giQ = bg.getInt((String)paramMap.get(".msg.appmsg.productitem.$type"), 0);
          this.giR = ((String)paramMap.get(".msg.appmsg.productitem.productinfo"));
          this.giT = bg.getInt((String)paramMap.get(".msg.appmsg.emoticongift.packageflag"), 0);
          this.giS = ((String)paramMap.get(".msg.appmsg.emoticongift.packageid"));
          this.giY = ((String)paramMap.get(".msg.appmsg.emoticonshared.packageid"));
          this.giZ = bg.getInt((String)paramMap.get(".msg.appmsg.emoticonshared.packageflag"), 0);
          this.giU = ((String)paramMap.get(".msg.appmsg.tvinfo"));
          this.giV = ((String)paramMap.get(".msg.appmsg.recorditem"));
          this.eTr = ((String)paramMap.get(".msg.appmsg.webviewshared.shareUrlOriginal"));
          this.eTs = ((String)paramMap.get(".msg.appmsg.webviewshared.shareUrlOpen"));
          this.eTt = ((String)paramMap.get(".msg.appmsg.webviewshared.jsAppId"));
          this.eTu = ((String)paramMap.get(".msg.appmsg.webviewshared.publisherId"));
          this.gkF = com.tencent.mm.a.o.bj((String)paramMap.get(".msg.appmsg.designershared.designeruin"));
          this.designerName = ((String)paramMap.get(".msg.appmsg.designershared.designername"));
          this.designerRediretctUrl = ((String)paramMap.get(".msg.appmsg.designershared.designerrediretcturl"));
          this.tid = bg.Sy((String)paramMap.get(".msg.appmsg.emotionpageshared.tid"));
          this.gkG = ((String)paramMap.get(".msg.appmsg.emotionpageshared.title"));
          this.desc = ((String)paramMap.get(".msg.appmsg.emotionpageshared.desc"));
          this.iconUrl = ((String)paramMap.get(".msg.appmsg.emotionpageshared.iconUrl"));
          this.secondUrl = bg.aq((String)paramMap.get(".msg.appmsg.emotionpageshared.secondUrl"), "");
          this.pageType = bg.Sy((String)paramMap.get(".msg.appmsg.emotionpageshared.pageType"));
          this.gkI = bg.aq((String)paramMap.get(".msg.appmsg.streamvideo.streamvideourl"), "");
          this.gkJ = bg.Sy((String)paramMap.get(".msg.appmsg.streamvideo.streamvideototaltime"));
          this.gkK = bg.aq((String)paramMap.get(".msg.appmsg.streamvideo.streamvideotitle"), "");
          this.gkL = bg.aq((String)paramMap.get(".msg.appmsg.streamvideo.streamvideowording"), "");
          this.gkM = bg.aq((String)paramMap.get(".msg.appmsg.streamvideo.streamvideoweburl"), "");
          this.gkN = bg.aq((String)paramMap.get(".msg.appmsg.streamvideo.streamvideothumburl"), "");
          this.gkO = bg.aq((String)paramMap.get(".msg.appmsg.streamvideo.streamvideoaduxinfo"), "");
          this.gkP = bg.aq((String)paramMap.get(".msg.appmsg.streamvideo.streamvideopublishid"), "");
          this.canvasPageXml = bg.aq((String)paramMap.get(".msg.appmsg.canvasPageItem.canvasPageXml"), "");
          this.gkR = ((String)paramMap.get(".msg.appmsg.weappinfo.username"));
          this.gkQ = ((String)paramMap.get(".msg.appmsg.weappinfo.pagepath"));
          this.gkS = ((String)paramMap.get(".msg.appmsg.weappinfo.appid"));
          this.gkZ = bg.getInt((String)paramMap.get(".msg.appmsg.weappinfo.version"), 0);
          this.gkT = bg.getInt((String)paramMap.get(".msg.appmsg.weappinfo.type"), 0);
          this.gkY = bg.getInt((String)paramMap.get(".msg.appmsg.weappinfo.pkginfo.type"), 0);
          this.gkU = ((String)paramMap.get(".msg.appmsg.weappinfo.pkginfo.md5"));
          this.gla = ((String)paramMap.get(".msg.appmsg.weappinfo.weappiconurl"));
          this.gkW = ((String)paramMap.get(".msg.appmsg.weappinfo.shareId"));
          this.gkX = ((String)paramMap.get(".msg.appmsg.weappinfo.sharekey"));
          i = parama.glf.indexOf("<cache");
          j = parama.glf.indexOf("</cache>");
          if (j - i > "<cache".length()) {
            this.glb = parama.glf.substring(i, "</cache>".length() + j);
          }
          this.glc = bg.getInt((String)paramMap.get(".msg.appmsg.soundtype"), 0);
          switch (this.type)
          {
          case 13: 
            if (this.type != 21) {
              break label3743;
            }
            this.showType = bg.getInt((String)paramMap.get(".msg.appmsg.hardwareinfo.hardwareshowtype"), 0);
            this.eTv = ((String)paramMap.get(".msg.appmsg.statextstr"));
            this.giO = bg.getInt((String)paramMap.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
            if ((this.giO == 5) && (bg.getInt((String)paramMap.get(".msg.appmsg.mmreader.category.$count"), 0) > 1)) {
              this.giO = 0;
            }
            this.giP = bg.getInt((String)paramMap.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
            this.gja = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.ranktitle"));
            this.gjb = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rankid"));
            if (bg.nm(this.gjb)) {
              this.gjb = ((String)paramMap.get(".msg.appmsg.hardwareinfo.likeuserlist.userinfo.rankid"));
            }
            this.gjc = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.rankdisplay"));
            this.gjd = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoretitle"));
            this.gje = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoredisplay"));
            this.gjf = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.tipdisplay"));
            this.gjg = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.color"));
            this.gjh = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.highlightcolor"));
            this.gji = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.linecolor"));
            this.gjk = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.fontcolor"));
            this.gjj = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.highlightlinecolor"));
            this.gjm = ((String)paramMap.get(".msg.appmsg.hardwareinfo.rankview.rankviewtitle"));
            this.gjl = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.championusername"));
            this.gjp = bg.getInt((String)paramMap.get(".msg.appmsg.hardwareinfo.hardwareshowtype"), 0);
            this.gjr = bg.getInt((String)paramMap.get(".msg.appmsg.hardwareinfo.timestamp"), 0);
            this.gjq = bg.getInt((String)paramMap.get(".msg.appmsg.hardwareinfo.devicetype"), 0);
            this.gjn = ((String)paramMap.get(".msg.appmsg.hardwareinfo.rankview.championinfo.motto"));
            this.gjo = ((String)paramMap.get(".msg.appmsg.hardwareinfo.rankview.championinfo.coverimgurl"));
            localObject = (String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.displayusername");
            this.gjv = ((String)localObject);
            this.gjt = ((String)localObject);
            localObject = (String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.title");
            this.gju = ((String)localObject);
            this.gjs = ((String)localObject);
            this.gjw = bg.nl((String)paramMap.get(".msg.appmsg.template_id"));
            this.filemd5 = ((String)paramMap.get(".msg.appmsg.md5"));
            this.gjP = bg.getInt((String)paramMap.get(".msg.appmsg.jumpcontrol.enable"), 0);
            this.gjQ = ((String)paramMap.get(".msg.appmsg.jumpcontrol.jumpurl"));
            this.gjR = ((String)paramMap.get(".msg.appmsg.jumpcontrol.pushcontent"));
            paramMap = bh.q(parama.glg, "msgoperation");
            if ((this != null) && (paramMap != null))
            {
              this.gis = new a();
              this.gis.fwE = ((String)paramMap.get(".msgoperation.expinfo.expidstr"));
              this.gis.glj = bg.getInt((String)paramMap.get(".msgoperation.appmsg.usedefaultthumb"), 0);
              this.gis.glk = bg.getInt((String)paramMap.get(".msgoperation.appmsg.isupdatetitle"), 0);
              this.gis.title = ((String)paramMap.get(".msgoperation.appmsg.title"));
              this.gis.gll = bg.getInt((String)paramMap.get(".msgoperation.appmsg.isupdatedesc"), 0);
              this.gis.desc = ((String)paramMap.get(".msgoperation.appmsg.desc"));
              this.gis.glm = bg.getInt((String)paramMap.get(".msgoperation.appmsg.ishiddentail"), 0);
            }
            GMTrace.o(16383286968320L, 122065);
            return;
          }
        }
        catch (Exception paramMap)
        {
          w.e("MicroMsg.AppMessage", "parse amessage xml failed");
          w.e("MicroMsg.AppMessage", "exception:%s", new Object[] { bg.f(paramMap) });
          throw paramMap;
        }
        this.giW = bg.getInt((String)paramMap.get(".msg.appmsg.mallproductitem.$type"), 0);
        this.giX = ((String)paramMap.get(".msg.appmsg.mallproductitem.mallproductinfo"));
        continue;
        this.gjx = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.paysubtype"), 0);
        this.gjy = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.feedesc"));
        this.gjz = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.transcationid"));
        this.gjA = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.transferid"));
        this.gjB = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.invalidtime"), 0);
        this.gjC = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.effectivedate"), 3);
        this.eRQ = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.total_fee"), 0);
        this.eCU = bg.aq((String)paramMap.get(".msg.appmsg.wcpayinfo.fee_type"), "ZAR");
        this.gkH = bg.aq((String)paramMap.get(".msg.appmsg.wcpayinfo.pay_memo"), "");
        continue;
        this.gjT = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.iconurl"));
        this.gjY = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.scenetext"));
        this.gjS = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.url"));
        this.gjU = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.receivertitle"));
        this.gjV = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.sendertitle"));
        this.gjX = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.receiverdes"));
        this.gjW = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.senderdes"));
        this.gjZ = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.templateid"));
        this.gka = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.sceneid"));
        this.gkb = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.nativeurl"));
        this.gkc = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.localtype"), 0);
        this.gkd = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.paymsgid"));
        this.gke = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.imageid"));
        this.gkf = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.imageaeskey"));
        this.gkg = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.imagelength"), 0);
        this.gki = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.droptips"), 0);
        this.gkj = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.billno"));
        this.gkk = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.newaatype"), 0);
        this.gkl = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.receivertitle"));
        this.gkm = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.launchertitle"));
        this.gkn = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.notinertitle"));
        Object localObject = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.receiverlist"));
        if (!bg.nm((String)localObject))
        {
          localObject = ((String)localObject).split("\\|");
          if ((localObject != null) && (localObject.length > 0))
          {
            this.gko = new ArrayList();
            this.gko.addAll(Arrays.asList((Object[])localObject));
          }
        }
        this.gkp = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.payertitle"));
        localObject = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.payerlist"));
        if (!bg.nm((String)localObject))
        {
          localObject = ((String)localObject).split("\\|");
          if ((localObject != null) && (localObject.length > 0))
          {
            this.gkq = new ArrayList();
            this.gkq.addAll(Arrays.asList((Object[])localObject));
          }
        }
        this.gkr = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.outtradeno"));
        this.gks = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.seq"), 0);
        this.gkt = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.launcherusername"));
        continue;
        this.gku = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.url"));
        this.gkv = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.templateid"));
        this.gkw = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.iconurl"));
        this.gkx = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.miniiconurl"));
        this.gky = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.backgroundurl"));
        this.gkz = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.receivertitle"));
        this.gkA = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.sendertitle"));
        this.gkB = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.scenetext"));
        this.gkC = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.senderdes"));
        this.gkD = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.receiverdes"));
        this.gkE = bg.nl((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.sceneid"));
        continue;
        this.eLl = parama.glf;
        this.gjD = "";
        this.gjF = bg.getInt((String)paramMap.get(".msg.appmsg.carditem.from_scene"), 2);
        this.gjE = ((String)paramMap.get(".msg.appmsg.carditem.brand_name"));
        this.gjG = bg.getInt((String)paramMap.get(".msg.appmsg.carditem.card_type"), -1);
        continue;
        if ((paramMap.get(".msg.alphainfo.url") != null) && (paramMap.get(".msg.alphainfo.md5") != null))
        {
          this.gkh = true;
          continue;
          this.gjI = bg.aq((String)paramMap.get(".msg.appmsg.giftcard_info.order_id"), "");
          this.gjH = com.tencent.mm.a.o.bj((String)paramMap.get(".msg.appmsg.giftcard_info.biz_uin"));
          this.gjJ = bg.aq((String)paramMap.get(".msg.appmsg.giftcard_info.app_name"), "");
          this.gjK = bg.aq((String)paramMap.get(".msg.appmsg.giftcard_info.recv_digest"), "");
          this.gjL = bg.aq((String)paramMap.get(".msg.appmsg.giftcard_info.send_digest"), "");
          this.gjM = bg.aq((String)paramMap.get(".msg.appmsg.giftcard_info.background_pic_url"), "");
          this.gjN = bg.aq((String)paramMap.get(".msg.appmsg.giftcard_info.title_color"), "");
          this.gjO = bg.aq((String)paramMap.get(".msg.appmsg.giftcard_info.des_color"), "");
          continue;
          label3743:
          if (this.type == 2001)
          {
            this.showType = bg.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.innertype"), 0);
          }
          else
          {
            this.showType = bg.getInt((String)paramMap.get(".msg.appmsg.showtype"), 0);
            switch (this.showType)
            {
            case 1: 
              if (bg.getInt((String)paramMap.get(".msg.appmsg.mmreader.category.$count"), 0) > 0) {
                this.content = aw.ah(paramMap);
              }
              break;
            case 2: 
              localObject = parama.glf.toLowerCase();
              i = ((String)localObject).indexOf("<ShakePageResult>".toLowerCase());
              j = ((String)localObject).indexOf("</ShakePageResult>".toLowerCase());
              this.giB = parama.glf.substring(i + 17, j);
              continue;
            }
          }
        }
      }
    }
    
    public final String getDescription()
    {
      GMTrace.i(17813376860160L, 132720);
      if ((this.gis != null) && (this.gis.gll != 0))
      {
        str = this.gis.desc;
        GMTrace.o(17813376860160L, 132720);
        return str;
      }
      String str = this.description;
      GMTrace.o(17813376860160L, 132720);
      return str;
    }
    
    public final String getTitle()
    {
      GMTrace.i(315009007616L, 2347);
      if ((this.gis != null) && (this.gis.glk != 0))
      {
        str = this.gis.title;
        GMTrace.o(315009007616L, 2347);
        return str;
      }
      String str = this.title;
      GMTrace.o(315009007616L, 2347);
      return str;
    }
    
    public final <T extends c> T n(Class<T> paramClass)
    {
      GMTrace.i(16689706041344L, 124348);
      paramClass = (c)this.gld.get(paramClass);
      GMTrace.o(16689706041344L, 124348);
      return paramClass;
    }
    
    public static final class a
    {
      public String desc;
      public String fwE;
      public int glj;
      public int glk;
      public int gll;
      public int glm;
      public int gln;
      public int glo;
      public String title;
      
      public a()
      {
        GMTrace.i(311116693504L, 2318);
        this.gln = 0;
        this.glo = 0;
        GMTrace.o(311116693504L, 2318);
      }
    }
  }
  
  public static final class b
  {
    public static final ArrayList<com.tencent.mm.bz.b<? extends c>> glp;
    private static final HashMap<Integer, com.tencent.mm.bz.b<? extends c>> glq;
    
    static
    {
      GMTrace.i(16383018532864L, 122063);
      glp = new ArrayList();
      glq = new HashMap();
      GMTrace.o(16383018532864L, 122063);
    }
    
    public static void a(com.tencent.mm.bz.b<? extends c> paramb)
    {
      GMTrace.i(16382750097408L, 122061);
      glp.add(paramb);
      GMTrace.o(16382750097408L, 122061);
    }
    
    public static c fn(int paramInt)
    {
      GMTrace.i(16382884315136L, 122062);
      Object localObject = (com.tencent.mm.bz.b)glq.get(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        localObject = (c)((com.tencent.mm.bz.b)localObject).get();
        ((c)localObject).type = paramInt;
        GMTrace.o(16382884315136L, 122062);
        return (c)localObject;
      }
      w.w("MicroMsg.AppMessage", "get for type(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(16382884315136L, 122062);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\x\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */