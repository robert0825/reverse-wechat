package com.tencent.mm.plugin.sns.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView;
import com.tencent.mm.plugin.sns.ui.previewimageview.c.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.protocal.c.bfx;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.tools.a.a;
import com.tencent.mm.y.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.a.d.i;

public final class ah
  extends a
{
  private String appId;
  private String appName;
  public MMActivity ezR;
  private String hNz;
  private int pPL;
  private b pPR;
  private boolean pRD;
  private boolean pTk;
  private boolean pTl;
  private WXMediaMessage pTm;
  public b pVj;
  private w pVk;
  Map<String, Exif.a> pVl;
  private Map<String, bfx> pVm;
  private int pVn;
  private boolean pVo;
  amc pVp;
  
  public ah(MMActivity paramMMActivity)
  {
    GMTrace.i(8667109785600L, 64575);
    this.pVj = new b();
    this.pRD = false;
    this.pVl = new HashMap();
    this.pVm = new HashMap();
    this.pVn = 0;
    this.pTk = false;
    this.pVo = false;
    this.pTl = false;
    this.pTm = null;
    this.pPR = null;
    this.ezR = paramMMActivity;
    GMTrace.o(8667109785600L, 64575);
  }
  
  private boolean J(Bundle paramBundle)
  {
    GMTrace.i(8667378221056L, 64577);
    if (paramBundle == null)
    {
      GMTrace.o(8667378221056L, 64577);
      return false;
    }
    paramBundle = paramBundle.getStringArrayList("sns_media_latlong_list");
    if (paramBundle == null)
    {
      GMTrace.o(8667378221056L, 64577);
      return false;
    }
    paramBundle = paramBundle.iterator();
    while (paramBundle.hasNext())
    {
      String[] arrayOfString = ((String)paramBundle.next()).split("\n");
      if (3 != arrayOfString.length)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "invalid params");
        GMTrace.o(8667378221056L, 64577);
        return true;
      }
      try
      {
        this.pVl.put(arrayOfString[0].trim(), new Exif.a(bg.getDouble(arrayOfString[1], 0.0D), bg.getDouble(arrayOfString[2], 0.0D), 0.0D));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", localNumberFormatException.toString());
      }
    }
    GMTrace.o(8667378221056L, 64577);
    return true;
  }
  
  private static aw a(aw paramaw, List<com.tencent.mm.plugin.sns.data.h> paramList)
  {
    GMTrace.i(8667915091968L, 64581);
    paramaw.bw(paramList);
    GMTrace.o(8667915091968L, 64581);
    return paramaw;
  }
  
  public final void G(Bundle paramBundle)
  {
    GMTrace.i(8667244003328L, 64576);
    this.pPR = b.q(this.ezR.getIntent());
    this.pRD = this.ezR.getIntent().getBooleanExtra("Kis_take_photo", false);
    this.appId = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.pTk = this.ezR.getIntent().getBooleanExtra("KThrid_app", false);
    this.pVo = this.ezR.getIntent().getBooleanExtra("KBlockAdd", false);
    this.pTl = this.ezR.getIntent().getBooleanExtra("KSnsAction", false);
    this.pPL = this.ezR.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.hNz = bg.aq(this.ezR.getIntent().getStringExtra("reportSessionId"), "");
    Object localObject1 = this.ezR.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (localObject1 != null) {
      this.pTm = new SendMessageToWX.Req((Bundle)localObject1).message;
    }
    Object localObject3 = this.ezR.getIntent().getStringExtra("sns_kemdia_path");
    Object localObject4 = this.ezR.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
    localObject1 = localObject4;
    if (localObject4 == null)
    {
      localObject1 = localObject4;
      if (this.pTm != null)
      {
        localObject1 = localObject4;
        if (this.pTm.mediaObject != null)
        {
          localObject1 = localObject4;
          if ((this.pTm.mediaObject instanceof WXImageObject)) {
            localObject1 = ((WXImageObject)this.pTm.mediaObject).imageData;
          }
        }
      }
    }
    if ((bg.nm((String)localObject3)) && (!bg.bq((byte[])localObject1)))
    {
      localObject3 = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(new StringBuilder(" ").append(System.currentTimeMillis()).toString().getBytes());
      FileOp.deleteFile((String)localObject3);
      FileOp.b((String)localObject3, (byte[])localObject1, localObject1.length);
    }
    label958:
    label972:
    Object localObject2;
    for (localObject1 = localObject3;; localObject2 = localObject3)
    {
      int j = this.ezR.getIntent().getIntExtra("KFilterId", 0);
      if (paramBundle == null) {}
      boolean bool;
      for (localObject3 = null;; localObject3 = paramBundle.getString("sns_kemdia_path_list"))
      {
        J(paramBundle);
        bool = J(this.ezR.getIntent().getExtras());
        this.pVn = 0;
        if (bg.nm((String)localObject3)) {
          break;
        }
        this.pVj.Jc((String)localObject3);
        GMTrace.o(8667244003328L, 64576);
        return;
      }
      if (!bg.nm((String)localObject1))
      {
        paramBundle = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + "pre_temp_sns_pic" + com.tencent.mm.a.g.n(((String)localObject1).getBytes());
        localObject3 = new File(paramBundle);
        if (!((File)localObject3).getParentFile().exists()) {
          ((File)localObject3).getParentFile().mkdirs();
        }
        FileOp.o((String)localObject1, paramBundle);
        if (j != -1) {
          break label972;
        }
      }
      for (int i = 0;; i = j)
      {
        this.pVj.m(paramBundle, i, this.pRD);
        if (!bool)
        {
          localObject3 = Exif.fromFile((String)localObject1).getLocation();
          if (localObject3 != null) {
            this.pVl.put(paramBundle, localObject3);
          }
        }
        try
        {
          localObject3 = new File((String)localObject1);
          localObject4 = new bfx();
          if (this.pRD) {}
          for (i = 1;; i = 2)
          {
            ((bfx)localObject4).uRO = i;
            ((bfx)localObject4).uRQ = (((File)localObject3).lastModified() / 1000L);
            ((bfx)localObject4).uRP = Exif.fromFile((String)localObject1).getUxtimeDatatimeOriginal();
            this.pVm.put(paramBundle, localObject4);
            GMTrace.o(8667244003328L, 64576);
            return;
          }
          paramBundle = this.ezR.getIntent().getStringArrayListExtra("sns_kemdia_path_list");
        }
        catch (Exception paramBundle)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "get report info error " + paramBundle.getMessage());
          GMTrace.o(8667244003328L, 64576);
          return;
        }
        if ((paramBundle != null) && (paramBundle.size() > 0))
        {
          paramBundle = paramBundle.iterator();
          if (paramBundle.hasNext())
          {
            localObject1 = (String)paramBundle.next();
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "newPath " + (String)localObject1);
            this.pVj.m((String)localObject1, j, false);
            if (!bool)
            {
              localObject3 = Exif.fromFile((String)localObject1).getLocation();
              if (localObject3 != null) {
                this.pVl.put(localObject1, localObject3);
              }
            }
            for (;;)
            {
              try
              {
                localObject3 = new File((String)localObject1);
                localObject4 = new bfx();
                if (!this.pRD) {
                  break label958;
                }
                i = 1;
                ((bfx)localObject4).uRO = i;
                ((bfx)localObject4).uRQ = (((File)localObject3).lastModified() / 1000L);
                ((bfx)localObject4).uRP = Exif.fromFile((String)localObject1).getUxtimeDatatimeOriginal();
                this.pVm.put(localObject1, localObject4);
              }
              catch (Exception localException)
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "get report info error " + localException.getMessage());
              }
              break;
              i = 2;
            }
          }
        }
        GMTrace.o(8667244003328L, 64576);
        return;
      }
    }
  }
  
  public final void H(Bundle paramBundle)
  {
    GMTrace.i(8667512438784L, 64578);
    paramBundle.putString("sns_kemdia_path_list", this.pVj.toString());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.pVl.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localArrayList.add(String.format("%s\n%f\n%f", new Object[] { localEntry.getKey(), Double.valueOf(((Exif.a)localEntry.getValue()).latitude), Double.valueOf(((Exif.a)localEntry.getValue()).longitude) }));
    }
    paramBundle.putStringArrayList("sns_media_latlong_list", localArrayList);
    paramBundle.getString("contentdesc");
    GMTrace.o(8667512438784L, 64578);
  }
  
  public final View a(View paramView1, View paramView2, DynamicGridView paramDynamicGridView, View paramView3)
  {
    GMTrace.i(15995800387584L, 119178);
    MMActivity localMMActivity = this.ezR;
    ArrayList localArrayList = this.pVj.pVu;
    w.a local1 = new w.a()
    {
      public final void ve(int paramAnonymousInt)
      {
        GMTrace.i(8587787108352L, 63984);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "I click");
        if (paramAnonymousInt < 0)
        {
          ah.this.boc();
          GMTrace.o(8587787108352L, 63984);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.setClass(ah.this.ezR, SnsUploadBrowseUI.class);
        localIntent.putExtra("sns_gallery_position", paramAnonymousInt);
        localIntent.putExtra("sns_gallery_temp_paths", ah.this.pVj.pVu);
        ah.this.ezR.startActivityForResult(localIntent, 7);
        GMTrace.o(8587787108352L, 63984);
      }
    };
    c.a local2 = new c.a()
    {
      public final void de(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(15994726645760L, 119170);
        ah.b localb = ah.this.pVj;
        if ((paramAnonymousInt1 != paramAnonymousInt2) && (localb.pVu.size() > paramAnonymousInt1))
        {
          String str = (String)localb.pVu.remove(paramAnonymousInt1);
          if (paramAnonymousInt2 < localb.pVu.size())
          {
            localb.pVu.add(paramAnonymousInt2, str);
            GMTrace.o(15994726645760L, 119170);
            return;
          }
          localb.pVu.add(str);
        }
        GMTrace.o(15994726645760L, 119170);
      }
      
      public final void removeItem(int paramAnonymousInt)
      {
        GMTrace.i(15994860863488L, 119171);
        ah.b localb = ah.this.pVj;
        if (localb.pVu.size() > paramAnonymousInt) {
          localb.pVu.remove(paramAnonymousInt);
        }
        if ((ah.this.ezR instanceof En_c4f742e5)) {
          ((En_c4f742e5)ah.this.ezR).bnp();
        }
        GMTrace.o(15994860863488L, 119171);
      }
    };
    if (!this.pVo) {}
    for (boolean bool = true;; bool = false)
    {
      this.pVk = new com.tencent.mm.plugin.sns.ui.previewimageview.e(paramView1, paramView2, paramView3, localMMActivity, localArrayList, paramDynamicGridView, local1, local2, bool);
      paramView1 = this.pVk.getView();
      GMTrace.o(15995800387584L, 119178);
      return paramView1;
    }
  }
  
  public final void a(aw paramaw)
  {
    GMTrace.i(8668049309696L, 64582);
    int i = paramaw.commit();
    if (this.pPR != null)
    {
      this.pPR.hc(i);
      com.tencent.mm.plugin.sns.h.e.pBV.b(this.pPR);
    }
    if ((this.pVj != null) && (this.pVj.pVu != null) && (com.tencent.mm.plugin.sns.storage.r.bmy())) {
      com.tencent.mm.plugin.report.service.g.ork.i(12834, new Object[] { Integer.valueOf(this.pVj.pVu.size()) });
    }
    paramaw = new Intent();
    paramaw.putExtra("sns_local_id", i);
    this.ezR.setResult(-1, paramaw);
    this.ezR.finish();
    GMTrace.o(8668049309696L, 64582);
  }
  
  public final boolean a(int paramInt1, int paramInt2, i parami, String paramString1, List<String> paramList1, amc paramamc, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8668183527424L, 64583);
    paramString2 = new LinkedList();
    Object localObject1 = this.pVj.pVu.iterator();
    int i = 0;
    Object localObject2;
    Object localObject3;
    label112:
    Object localObject4;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localObject3 = new com.tencent.mm.plugin.sns.data.h((String)localObject2, 2);
      ((com.tencent.mm.plugin.sns.data.h)localObject3).type = 2;
      ((com.tencent.mm.plugin.sns.data.h)localObject3).ppn = paramInt1;
      int j;
      if (i == 0)
      {
        ((com.tencent.mm.plugin.sns.data.h)localObject3).ppm = paramInt2;
        if (parami != null)
        {
          ((com.tencent.mm.plugin.sns.data.h)localObject3).ppp = parami.token;
          ((com.tencent.mm.plugin.sns.data.h)localObject3).ppq = parami.uDu;
        }
        localObject4 = this.pVj;
        if (!((b)localObject4).pVw.containsKey(localObject2)) {
          break label251;
        }
        j = ((Integer)((b)localObject4).pVw.get(localObject2)).intValue();
        label153:
        ((com.tencent.mm.plugin.sns.data.h)localObject3).ppl = j;
        ((com.tencent.mm.plugin.sns.data.h)localObject3).desc = paramString1;
        localObject4 = this.pVj;
        if ((bg.nm((String)localObject2)) || (!((b)localObject4).pVv.containsKey(localObject2))) {
          break label257;
        }
      }
      label251:
      label257:
      for (boolean bool = ((Boolean)((b)localObject4).pVv.get(localObject2)).booleanValue();; bool = false)
      {
        ((com.tencent.mm.plugin.sns.data.h)localObject3).pps = bool;
        paramString2.add(localObject3);
        i += 1;
        break;
        ((com.tencent.mm.plugin.sns.data.h)localObject3).ppm = 0;
        break label112;
        j = 0;
        break label153;
      }
    }
    localObject1 = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      localObject2 = s.At();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        localObject3 = (String)paramList1.next();
        if (!((List)localObject2).contains(localObject3))
        {
          localObject4 = new bgp();
          ((bgp)localObject4).jhi = ((String)localObject3);
          ((LinkedList)localObject1).add(localObject4);
        }
      }
    }
    paramList1 = new aw(1);
    paramPInt.value = paramList1.iZe;
    if (parami != null) {
      paramList1.dH(parami.token, parami.uDu);
    }
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.poV) {
      paramList1.uA(3);
    }
    paramList1.HI(paramString1).a(paramamc).ak((LinkedList)localObject1).uC(paramInt1).uD(paramInt2);
    if (paramBoolean) {
      paramList1.uF(1);
    }
    for (;;)
    {
      if (!bg.nm(this.appId)) {
        paramList1.HO(this.appId);
      }
      if (!bg.nm(this.appName)) {
        paramList1.HP(bg.aq(this.appName, ""));
      }
      paramList1.uE(this.pPL);
      if (this.pTk) {
        paramList1.uE(5);
      }
      if ((this.pTl) && (this.pTm != null))
      {
        paramList1.HJ(this.pTm.mediaTagName);
        paramList1.U(this.appId, this.pTm.messageExt, this.pTm.messageAction);
      }
      paramList1.d(null, null, null, paramInt4, paramInt5);
      paramList1.bv(paramList2);
      paramList1.oJ(this.hNz);
      if ((paramamc != null) && (paramamc.score != 0))
      {
        paramInt1 = paramamc.score;
        parami = paramamc.uAX;
        paramList1.pwK.uDD = new bes();
        paramList1.pwK.uDD.uQy = paramInt1;
        paramList1.pwK.uDD.uQv = parami;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PicWidget", "commit pic size %d, browseImageCount:%d", new Object[] { Integer.valueOf(paramString2.size()), Integer.valueOf(this.pVn) });
      com.tencent.mm.plugin.report.service.g.ork.i(11602, new Object[] { Integer.valueOf(this.pVn), Integer.valueOf(paramString2.size()) });
      parami = paramString2.iterator();
      while (parami.hasNext())
      {
        paramString1 = (com.tencent.mm.plugin.sns.data.h)parami.next();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PicWidget", "commit path  %s len: %d", new Object[] { paramString1.path, Long.valueOf(FileOp.kX(paramString1.path)) });
      }
      paramList1.uF(0);
    }
    paramString1 = paramString2.iterator();
    if (paramString1.hasNext())
    {
      paramamc = ((com.tencent.mm.plugin.sns.data.h)paramString1.next()).path;
      parami = (bfx)this.pVm.get(paramamc);
      if (parami != null) {
        break label1333;
      }
      parami = new bfx();
    }
    label946:
    label1252:
    label1333:
    for (;;)
    {
      if ((this.pVp != null) && ((this.pVp.tYz != 0.0F) || (this.pVp.tYy != 0.0F)))
      {
        parami.uRM = this.pVp.tYz;
        parami.uRN = this.pVp.tYy;
        parami.pTO = this.pVp.pTO;
        parami.aFG = this.pVp.aFG;
        paramamc = (Exif.a)this.pVl.get(paramamc);
        if ((paramamc == null) || ((paramamc.latitude == 0.0D) && (paramamc.longitude == 0.0D))) {
          break label1252;
        }
        parami.uRK = ((float)paramamc.latitude);
      }
      for (parami.uRL = ((float)paramamc.longitude);; parami.uRL = -1000.0F)
      {
        paramamc = new StringBuffer();
        paramamc.append("||index: " + paramList1.pwK.uDy.size());
        paramamc.append("||item poi lat " + parami.uRM + " " + parami.uRN);
        paramamc.append("||item pic lat " + parami.uRK + " " + parami.uRL);
        paramamc.append("||item exitime:" + parami.uRP + " filetime: " + parami.uRQ);
        paramamc.append("||item source: " + parami.uRO);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.UploadPackHelper", "addSnsReportInfo item : " + paramamc.toString());
        paramList1.pwK.uDy.add(parami);
        break;
        parami.uRM = -1000.0F;
        parami.uRN = -1000.0F;
        break label946;
        parami.uRK = -1000.0F;
      }
      if (paramString2.size() <= 1)
      {
        a(paramList1, paramString2);
        a(paramList1);
      }
      for (;;)
      {
        GMTrace.o(8668183527424L, 64583);
        return true;
        new a(paramList1, paramString2).m(new String[] { "" });
      }
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8668586180608L, 64586);
    Object localObject1;
    switch (paramInt)
    {
    case 5: 
    case 6: 
    case 8: 
    case 10: 
    default: 
    case 2: 
    case 3: 
    case 9: 
    case 11: 
      do
      {
        do
        {
          GMTrace.o(8668586180608L, 64586);
          return false;
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "onActivityResult 1");
          if (paramIntent == null)
          {
            GMTrace.o(8668586180608L, 64586);
            return false;
          }
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "onActivityResult CONTEXT_CHOSE_IMAGE");
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("CropImageMode", 4);
          ((Intent)localObject1).putExtra("CropImage_DirectlyIntoFilter", true);
          ((Intent)localObject1).putExtra("CropImage_Filter", true);
          com.tencent.mm.plugin.sns.c.a.hnH.a(this.ezR, paramIntent, (Intent)localObject1, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath(), 4, new a.a()
          {
            public final String Jb(String paramAnonymousString)
            {
              GMTrace.i(15995263516672L, 119174);
              paramAnonymousString = com.tencent.mm.a.g.n((paramAnonymousString + System.currentTimeMillis()).getBytes());
              paramAnonymousString = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramAnonymousString;
              GMTrace.o(15995263516672L, 119174);
              return paramAnonymousString;
            }
          });
          GMTrace.o(8668586180608L, 64586);
          return true;
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "onActivityResult 2");
          paramIntent = k.b(this.ezR.getApplicationContext(), paramIntent, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath());
          if (paramIntent == null)
          {
            GMTrace.o(8668586180608L, 64586);
            return true;
          }
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("CropImageMode", 4);
          ((Intent)localObject1).putExtra("CropImage_Filter", true);
          ((Intent)localObject1).putExtra("CropImage_DirectlyIntoFilter", true);
          ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
          String str = com.tencent.mm.a.g.n((paramIntent + System.currentTimeMillis()).getBytes());
          ((Intent)localObject1).putExtra("CropImage_OutputPath", com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str);
          Object localObject2 = Exif.fromFile(paramIntent).getLocation();
          if (localObject2 != null)
          {
            this.pVl.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, localObject2);
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "take picture lat:%f, long:%f", new Object[] { Double.valueOf(((Exif.a)localObject2).latitude), Double.valueOf(((Exif.a)localObject2).longitude) });
          }
          localObject2 = new bfx();
          ((bfx)localObject2).uRO = 1;
          ((bfx)localObject2).uRQ = System.currentTimeMillis();
          ((bfx)localObject2).uRP = bg.Sz(Exif.fromFile(paramIntent).dateTime);
          this.pVm.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, localObject2);
          com.tencent.mm.plugin.sns.c.a.hnH.a(this.ezR, (Intent)localObject1, 4);
          this.pRD = true;
          GMTrace.o(8668586180608L, 64586);
          return true;
          bool = c(paramIntent.getStringArrayListExtra("CropImage_OutputPath_List"), paramIntent.getIntExtra("CropImage_filterId", 0), paramIntent.getBooleanExtra("isTakePhoto", false));
          GMTrace.o(8668586180608L, 64586);
          return bool;
          paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        } while (paramIntent == null);
        paramIntent = paramIntent.mWN;
      } while (bg.nm(paramIntent));
      boolean bool = c(Collections.singletonList(paramIntent), 0, true);
      GMTrace.o(8668586180608L, 64586);
      return bool;
    case 4: 
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "onActivityResult 3");
      if (paramIntent == null)
      {
        GMTrace.o(8668586180608L, 64586);
        return true;
      }
      localObject1 = paramIntent.getStringExtra("CropImage_OutputPath");
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "REQUEST_CODE_IMAGE_SEND_COMFIRM filePath " + (String)localObject1);
      if (localObject1 == null)
      {
        GMTrace.o(8668586180608L, 64586);
        return true;
      }
      if (!FileOp.aZ((String)localObject1))
      {
        GMTrace.o(8668586180608L, 64586);
        return true;
      }
      if (this.pVj.pVu.size() >= 9)
      {
        GMTrace.o(8668586180608L, 64586);
        return true;
      }
      paramInt = paramIntent.getIntExtra("CropImage_filterId", 0);
      paramIntent = "pre_temp_sns_pic" + com.tencent.mm.a.g.n(new StringBuilder().append((String)localObject1).append(System.currentTimeMillis()).toString().getBytes());
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PicWidget", "onactivity result " + FileOp.kX((String)localObject1) + " " + (String)localObject1);
      FileOp.o((String)localObject1, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramIntent);
      if (this.pVl.containsKey(localObject1)) {
        this.pVl.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramIntent, this.pVl.get(localObject1));
      }
      paramIntent = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramIntent;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "newPath " + paramIntent);
      this.pVj.m(paramIntent, paramInt, false);
      this.pVk.bD(this.pVj.pVu);
      GMTrace.o(8668586180608L, 64586);
      return true;
    }
    if (paramIntent == null)
    {
      GMTrace.o(8668586180608L, 64586);
      return true;
    }
    this.pVj.R(paramIntent.getStringArrayListExtra("sns_gallery_temp_paths"));
    this.pVk.bD(this.pVj.pVu);
    this.pVn = paramIntent.getIntExtra("sns_update_preview_image_count", 0);
    GMTrace.o(8668586180608L, 64586);
    return true;
  }
  
  public final boolean bmT()
  {
    GMTrace.i(8667646656512L, 64579);
    if (this.pVj != null)
    {
      b localb = this.pVj;
      if ((localb.pVu != null) && (localb.pVu.size() > 0)) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(8667646656512L, 64579);
        return true;
      }
    }
    GMTrace.o(8667646656512L, 64579);
    return false;
  }
  
  public final View bmU()
  {
    GMTrace.i(8667780874240L, 64580);
    this.pVk = new PreviewImageView(this.ezR);
    if (this.pVo) {
      this.pVk.bnx();
    }
    this.pVk.a(new w.a()
    {
      public final void ve(int paramAnonymousInt)
      {
        GMTrace.i(15995934605312L, 119179);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "I click");
        if (paramAnonymousInt < 0)
        {
          ah.this.boc();
          GMTrace.o(15995934605312L, 119179);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.setClass(ah.this.ezR, SnsUploadBrowseUI.class);
        localIntent.putExtra("sns_gallery_position", paramAnonymousInt);
        localIntent.putExtra("sns_gallery_temp_paths", ah.this.pVj.pVu);
        ah.this.ezR.startActivityForResult(localIntent, 7);
        GMTrace.o(15995934605312L, 119179);
      }
    });
    this.pVk.bD(this.pVj.pVu);
    View localView = this.pVk.getView();
    GMTrace.o(8667780874240L, 64580);
    return localView;
  }
  
  public final boolean bmV()
  {
    GMTrace.i(8668720398336L, 64587);
    if (this.pVk != null) {
      this.pVk.clean();
    }
    GMTrace.o(8668720398336L, 64587);
    return false;
  }
  
  protected final boolean boc()
  {
    GMTrace.i(8668317745152L, 64584);
    com.tencent.mm.kernel.h.xz();
    if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
    {
      u.fo(this.ezR);
      GMTrace.o(8668317745152L, 64584);
      return false;
    }
    if (this.pVj.pVu.size() >= 9)
    {
      com.tencent.mm.ui.base.h.h(this.ezR, i.j.plf, i.j.cUG);
      GMTrace.o(8668317745152L, 64584);
      return false;
    }
    try
    {
      ba localba = new ba(this.ezR);
      localba.qik = new p.c()
      {
        public final void a(n paramAnonymousn)
        {
          GMTrace.i(15966272487424L, 118958);
          if (!com.tencent.mm.platformtools.r.hlf) {
            paramAnonymousn.e(0, ah.this.ezR.getString(i.j.cSS));
          }
          paramAnonymousn.e(1, ah.this.ezR.getString(i.j.cSW));
          GMTrace.o(15966272487424L, 118958);
        }
      };
      localba.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(15994055557120L, 119165);
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(15994055557120L, 119165);
            return;
            if (9 - ah.this.pVj.pVu.size() <= 0)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "has select the max image count");
              GMTrace.o(15994055557120L, 119165);
              return;
            }
            com.tencent.mm.plugin.report.service.g.ork.i(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
            paramAnonymousMenuItem = new Intent();
            k.a(ah.this.ezR, 11, paramAnonymousMenuItem, 2, 2);
            GMTrace.o(15994055557120L, 119165);
            return;
            paramAnonymousInt = 9 - ah.this.pVj.pVu.size();
            if (paramAnonymousInt <= 0)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "has select the max image count");
              GMTrace.o(15994055557120L, 119165);
              return;
            }
            paramAnonymousMenuItem = ah.this.ezR.getSharedPreferences(ab.bPU(), 0).getString("gallery", "1");
            com.tencent.mm.plugin.report.service.g.ork.i(13822, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
            if (paramAnonymousMenuItem.equalsIgnoreCase("0"))
            {
              k.P(ah.this.ezR);
              GMTrace.o(15994055557120L, 119165);
              return;
            }
            k.a(ah.this.ezR, 9, paramAnonymousInt, 4, 1, false, null);
          }
        }
      };
      localba.bpI();
      GMTrace.o(8668317745152L, 64584);
      return true;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final boolean c(List<String> paramList, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8668451962880L, 64585);
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PicWidget", "no image selected");
      GMTrace.o(8668451962880L, 64585);
      return true;
    }
    if (this.pVj.pVu.size() >= 9)
    {
      GMTrace.o(8668451962880L, 64585);
      return true;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (String)paramList.next();
      if (FileOp.aZ((String)localObject))
      {
        String str = "pre_temp_sns_pic" + com.tencent.mm.a.g.n(new StringBuilder().append((String)localObject).append(System.currentTimeMillis()).toString().getBytes());
        com.tencent.mm.plugin.sns.storage.r.X(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath(), (String)localObject, str);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "newPath " + com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str);
        this.pVj.m(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, paramInt, paramBoolean);
        this.pVk.bD(this.pVj.pVu);
        for (;;)
        {
          try
          {
            File localFile = new File((String)localObject);
            bfx localbfx = new bfx();
            if (!paramBoolean) {
              continue;
            }
            i = 1;
            localbfx.uRO = i;
            localbfx.uRQ = (localFile.lastModified() / 1000L);
            localbfx.uRP = Exif.fromFile((String)localObject).getUxtimeDatatimeOriginal();
            this.pVm.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, localbfx);
          }
          catch (Exception localException)
          {
            int i;
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "get report info error " + localException.getMessage());
            continue;
          }
          localObject = Exif.fromFile((String)localObject).getLocation();
          if (localObject == null) {
            break;
          }
          this.pVl.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, localObject);
          break;
          i = 2;
        }
      }
    }
    GMTrace.o(8668451962880L, 64585);
    return true;
  }
  
  final class a
    extends com.tencent.mm.plugin.sns.model.h<String, Integer, Boolean>
  {
    private ProgressDialog htG;
    private aw pUg;
    private List<com.tencent.mm.plugin.sns.data.h> pVr;
    
    public a(List<com.tencent.mm.plugin.sns.data.h> paramList)
    {
      GMTrace.i(8639058280448L, 64366);
      this.htG = null;
      this.pUg = paramList;
      List localList;
      this.pVr = localList;
      paramList = ah.this.ezR;
      ah.this.ezR.getString(i.j.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(paramList, ah.this.ezR.getString(i.j.cTt), false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(8428336447488L, 62796);
          GMTrace.o(8428336447488L, 62796);
        }
      });
      GMTrace.o(8639058280448L, 64366);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae biu()
    {
      GMTrace.i(8639192498176L, 64367);
      com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.biQ();
      GMTrace.o(8639192498176L, 64367);
      return localae;
    }
  }
  
  final class b
  {
    ArrayList<String> pVu;
    Map<String, Boolean> pVv;
    Map<String, Integer> pVw;
    
    b()
    {
      GMTrace.i(8364314591232L, 62319);
      this.pVu = new ArrayList();
      this.pVv = new HashMap();
      this.pVw = new HashMap();
      GMTrace.o(8364314591232L, 62319);
    }
    
    public final b Jc(String paramString)
    {
      int i = 0;
      GMTrace.i(8364717244416L, 62322);
      try
      {
        paramString = paramString.split(";");
        int j = paramString.length;
        while (i < j)
        {
          String[] arrayOfString = paramString[i].split(",");
          this.pVu.add(arrayOfString[0]);
          this.pVw.put(arrayOfString[0], Integer.valueOf(bg.getInt(arrayOfString[1], 0)));
          i += 1;
        }
        return this;
      }
      catch (Exception paramString)
      {
        GMTrace.o(8364717244416L, 62322);
      }
    }
    
    public final void R(ArrayList<String> paramArrayList)
    {
      GMTrace.i(17147791147008L, 127761);
      this.pVv.clear();
      if (paramArrayList == null)
      {
        this.pVu = new ArrayList();
        GMTrace.o(17147791147008L, 127761);
        return;
      }
      this.pVu = paramArrayList;
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String str = (String)paramArrayList.next();
        this.pVv.put(str, Boolean.valueOf(false));
      }
      GMTrace.o(17147791147008L, 127761);
    }
    
    public final b m(String paramString, int paramInt, boolean paramBoolean)
    {
      GMTrace.i(17147656929280L, 127760);
      this.pVu.add(paramString);
      this.pVw.put(paramString, Integer.valueOf(paramInt));
      this.pVv.put(paramString, Boolean.valueOf(paramBoolean));
      GMTrace.o(17147656929280L, 127760);
      return this;
    }
    
    public final String toString()
    {
      GMTrace.i(8364583026688L, 62321);
      Iterator localIterator = this.pVu.iterator();
      String str2;
      int i;
      for (String str1 = ""; localIterator.hasNext(); str1 = str1 + str2 + "," + i + ";")
      {
        str2 = (String)localIterator.next();
        i = 0;
        if (this.pVw != null) {
          i = ((Integer)this.pVw.get(str2)).intValue();
        }
      }
      GMTrace.o(8364583026688L, 62321);
      return str1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */