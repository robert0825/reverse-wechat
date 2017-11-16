package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.cu;
import com.tencent.mm.g.a.df;
import com.tencent.mm.g.a.df.b;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.dx;
import com.tencent.mm.g.a.dx.a;
import com.tencent.mm.g.a.ea;
import com.tencent.mm.g.a.ea.b;
import com.tencent.mm.g.a.eb;
import com.tencent.mm.g.a.eb.a;
import com.tencent.mm.g.a.en;
import com.tencent.mm.g.a.en.a;
import com.tencent.mm.g.a.hq;
import com.tencent.mm.g.a.hq.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXLocationObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.Sort3rdAppUI;
import com.tencent.mm.ui.base.HorizontalListView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class ChattingSendDataToDeviceUI
  extends MMActivity
{
  boolean eFM;
  private f.a eRj;
  private long fKQ;
  String filePath;
  String hLy;
  private String kyP;
  private au qvi;
  private HorizontalListView tBi;
  private HorizontalListView wAJ;
  private c wAK;
  private a wAL;
  private int wAM;
  private String wAN;
  private RelativeLayout wAO;
  private RelativeLayout wAP;
  private TextView wAQ;
  private Boolean wAR;
  private b wAS;
  private List<c> wAT;
  private List<com.tencent.mm.pluginsdk.model.app.f> wAU;
  private long wAV;
  private boolean wAW;
  boolean wAX;
  boolean wAY;
  int wAZ;
  int wBa;
  private HashMap<String, View> wBb;
  HashMap<String, c> wBc;
  Map<Integer, View> wBd;
  Map<String, Integer> wBe;
  WXMediaMessage wBf;
  private com.tencent.mm.sdk.b.c wBg;
  private com.tencent.mm.sdk.b.c wBh;
  private boolean wqK;
  boolean wrB;
  
  public ChattingSendDataToDeviceUI()
  {
    GMTrace.i(2310960840704L, 17218);
    this.wAN = "";
    this.wAR = Boolean.valueOf(false);
    this.wAT = new ArrayList();
    this.wAU = new ArrayList();
    this.wAV = 0L;
    this.wAW = true;
    this.eFM = false;
    this.wAX = false;
    this.wAY = true;
    this.wAZ = 2;
    this.wBa = -1;
    this.wBb = new HashMap();
    this.wBc = new HashMap();
    this.wBd = new HashMap();
    this.wBe = new HashMap();
    this.wBf = null;
    this.filePath = null;
    this.hLy = null;
    this.wrB = false;
    this.wBg = new com.tencent.mm.sdk.b.c() {};
    this.wBh = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(2310960840704L, 17218);
  }
  
  private static boolean a(c paramc, long paramLong)
  {
    boolean bool = true;
    GMTrace.i(2312303017984L, 17228);
    if (paramLong == -1L)
    {
      GMTrace.o(2312303017984L, 17228);
      return false;
    }
    String str1 = paramc.eFL;
    at.AR();
    Object localObject = com.tencent.mm.y.c.yM().cM(paramLong);
    if ((((ce)localObject).field_msgId == 0L) || (str1 == null))
    {
      GMTrace.o(2312303017984L, 17228);
      return false;
    }
    int i = ((ce)localObject).field_type;
    String str2 = ((ce)localObject).field_content;
    if (((au)localObject).aCp())
    {
      localObject = f.a.eS(str2);
      if (localObject == null)
      {
        w.e("MicroMsg.ChattingSendDataToDeviceUI", "get content is null");
        GMTrace.o(2312303017984L, 17228);
        return false;
      }
      if (((f.a)localObject).type == 3) {
        if (!str1.contains("wxmsg_music")) {
          break label198;
        }
      }
    }
    for (;;)
    {
      GMTrace.o(2312303017984L, 17228);
      return bool;
      if (((f.a)localObject).type == 4) {
        bool = false;
      } else if (((f.a)localObject).type == 6)
      {
        if (str1.contains("wxmsg_file")) {}
      }
      else {
        label198:
        label269:
        label289:
        do
        {
          do
          {
            do
            {
              do
              {
                bool = false;
                break;
                if (((f.a)localObject).type == 5)
                {
                  bool = a(((f.a)localObject).url, paramc);
                  break;
                }
              } while ((((f.a)localObject).type != 2) || (!str1.contains("wxmsg_image")));
              break;
              if (i != 3) {
                break label269;
              }
            } while (!str1.contains("wxmsg_image"));
            break;
            if (i != 48) {
              break label289;
            }
          } while (!str1.contains("wxmsg_poi"));
          break;
        } while ((i != 62) || (!str1.contains("wxmsg_video")));
      }
    }
  }
  
  private static boolean a(c paramc, String paramString)
  {
    boolean bool = true;
    GMTrace.i(2312034582528L, 17226);
    if (paramString == null)
    {
      GMTrace.o(2312034582528L, 17226);
      return false;
    }
    Object localObject = new hq();
    ((hq)localObject).eKU.eEM = paramString;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    paramString = ((hq)localObject).eKV.eKW;
    int i = paramString.uUc.ueV;
    w.i("MicroMsg.ChattingSendDataToDeviceUI", "isNeedToShowSnsInfo contentStyle %d", new Object[] { Integer.valueOf(i) });
    localObject = paramc.eFL;
    if (localObject == null)
    {
      w.e("MicroMsg.ChattingSendDataToDeviceUI", "ability is null");
      GMTrace.o(2312034582528L, 17226);
      return false;
    }
    if (i == 1) {
      if (!((String)localObject).contains("wxmsg_image")) {
        break label162;
      }
    }
    for (;;)
    {
      GMTrace.o(2312034582528L, 17226);
      return bool;
      if (i == 4)
      {
        if (((String)localObject).contains("wxmsg_music")) {}
      }
      else
      {
        label162:
        label187:
        do
        {
          do
          {
            bool = false;
            break;
            if (i != 15) {
              break label187;
            }
          } while (!((String)localObject).contains("wxmsg_video"));
          break;
        } while (i != 3);
        bool = a(paramString.uUc.lPM, paramc);
      }
    }
  }
  
  private static boolean a(String paramString, c paramc)
  {
    bool2 = false;
    GMTrace.i(2311900364800L, 17225);
    Object localObject = paramc.eFL;
    paramc = paramc.wBu;
    paramString = Uri.parse(paramString).getHost();
    bool1 = bool2;
    if (paramc != null)
    {
      bool1 = bool2;
      if (paramc.length() > 0)
      {
        bool1 = bool2;
        if (localObject != null)
        {
          bool1 = bool2;
          if (!((String)localObject).contains("wxmsg_url")) {}
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject = new JSONObject(paramc).getJSONArray("wxmsg_url");
        int j = ((JSONArray)localObject).length();
        i = 0;
        bool1 = bool2;
        if (i < j)
        {
          bool1 = ((JSONArray)localObject).getString(i).equals(paramString);
          if (!bool1) {
            continue;
          }
          bool1 = true;
        }
      }
      catch (JSONException paramString)
      {
        int i;
        w.printErrStackTrace("MicroMsg.ChattingSendDataToDeviceUI", paramString, paramc, new Object[0]);
        bool1 = bool2;
        continue;
      }
      GMTrace.o(2311900364800L, 17225);
      return bool1;
      i += 1;
    }
  }
  
  private void ccO()
  {
    GMTrace.i(2311631929344L, 17223);
    if ((this.wAK == null) || (this.wAV == 0L))
    {
      if (this.wAK == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.e("MicroMsg.ChattingSendDataToDeviceUI", "mAppInfoAdapter is null %s, contentFlag %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(this.wAV) });
        if (this.wAP != null) {
          this.wAP.setVisibility(8);
        }
        GMTrace.o(2311631929344L, 17223);
        return;
      }
    }
    this.wAU = com.tencent.mm.pluginsdk.model.app.g.b(this, this.wAV, false);
    if ((!com.tencent.mm.pluginsdk.model.app.g.l(this, this.wAV)) && (this.wAP != null)) {
      this.wAP.setVisibility(8);
    }
    ArrayList localArrayList = new ArrayList();
    final Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((this.wAU != null) && (this.wAU.size() > 0))
    {
      localObject1 = an.bJJ().eu(this.wAV);
      if ((localObject1 != null) && (((List)localObject1).size() > 0)) {
        Collections.sort(this.wAU, new Comparator() {});
      }
      localObject1 = this.wAU.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject1).next();
        localObject3 = new dh();
        ((dh)localObject3).appId = ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId;
        ((dh)localObject3).fMz = ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appName;
        ((dh)localObject3).iconUrl = ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appIconUrl;
        localArrayList.add(localObject3);
      }
    }
    if (this.wBf == null)
    {
      localObject2 = null;
      localObject3 = null;
      switch (this.qvi.field_type)
      {
      default: 
        localObject1 = localObject3;
      }
    }
    for (;;)
    {
      this.wBf = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject1);
      this.wBf.sdkVer = 620822528;
      if ((this.hLy != null) && (this.filePath != null) && (localObject1 != null) && ((localObject1 instanceof WXFileObject))) {
        this.wrB = true;
      }
      label411:
      this.wAK.wrB = this.wrB;
      this.wAK.at(localArrayList);
      this.wAK.notifyDataSetChanged();
      GMTrace.o(2311631929344L, 17223);
      return;
      localObject1 = localObject3;
      if (this.eRj != null) {
        if (this.eRj.type == 3)
        {
          localObject1 = new WXMusicObject();
          ((WXMusicObject)localObject1).musicUrl = this.eRj.url;
          ((WXMusicObject)localObject1).musicDataUrl = this.eRj.giM;
          ((WXMusicObject)localObject1).musicLowBandUrl = this.eRj.giu;
          ((WXMusicObject)localObject1).musicLowBandDataUrl = this.eRj.giN;
        }
        else if (this.eRj.type == 4)
        {
          localObject1 = new WXVideoObject();
          ((WXVideoObject)localObject1).videoUrl = this.eRj.url;
          ((WXVideoObject)localObject1).videoLowBandUrl = this.eRj.giN;
        }
        else if (this.eRj.type == 5)
        {
          localObject1 = new WXWebpageObject(this.eRj.url);
        }
        else
        {
          if (this.eRj.type == 6)
          {
            localObject3 = an.afP().Op(this.eRj.eAE);
            if (localObject3 != null)
            {
              w.i("MicroMsg.ChattingSendDataToDeviceUI", "getWXMediaMessage fileFullPath %s", new Object[] { ((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath });
              localObject1 = new WXFileObject(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath);
              this.filePath = ((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath;
              this.hLy = this.eRj.giw;
            }
            while (q.OE(this.filePath) != null)
            {
              h.bm(this, getString(R.l.dhj));
              finish();
              break label411;
              w.e("MicroMsg.ChattingSendDataToDeviceUI", "getWXMediaMessage attInfo is null");
              localObject1 = localObject2;
            }
          }
          localObject1 = localObject3;
          if (this.eRj.type == 2)
          {
            localObject1 = new WXImageObject();
            localObject2 = n.IZ().n(this.qvi);
            if (localObject2 != null)
            {
              ((WXImageObject)localObject1).imagePath = n.IZ().ke(((d)localObject2).gGS);
              if (bg.nm(((WXImageObject)localObject1).imagePath)) {
                ((WXImageObject)localObject1).imagePath = n.IZ().ke(((d)localObject2).gGU);
              }
            }
            this.filePath = ((WXImageObject)localObject1).imagePath;
            this.hLy = this.eRj.giw;
            w.i("MicroMsg.ChattingSendDataToDeviceUI", "getWXMediaMessage imagePath %s", new Object[] { ((WXImageObject)localObject1).imagePath });
            continue;
            localObject1 = new WXTextObject(this.qvi.field_content);
            continue;
            localObject1 = new WXImageObject();
            localObject2 = n.IZ().n(this.qvi);
            int i;
            if (localObject2 != null)
            {
              ((WXImageObject)localObject1).imagePath = n.IZ().ke(((d)localObject2).gGS);
              if (bg.nm(((WXImageObject)localObject1).imagePath)) {
                ((WXImageObject)localObject1).imagePath = n.IZ().ke(((d)localObject2).gGU);
              }
              if (!bg.nm(((WXImageObject)localObject1).imagePath))
              {
                this.filePath = ((WXImageObject)localObject1).imagePath;
                i = ((WXImageObject)localObject1).imagePath.lastIndexOf(".");
                if ((i >= 0) && (i < ((WXImageObject)localObject1).imagePath.length() - 1)) {
                  this.hLy = ((WXImageObject)localObject1).imagePath.substring(i + 1);
                }
              }
            }
            w.i("MicroMsg.ChattingSendDataToDeviceUI", "getWXMediaMessage imagePath %s", new Object[] { ((WXImageObject)localObject1).imagePath });
            continue;
            at.AR();
            localObject1 = com.tencent.mm.y.c.yM().Co(this.qvi.field_content);
            localObject1 = new WXLocationObject(((au.b)localObject1).mwH, ((au.b)localObject1).mwI);
            continue;
            localObject2 = new WXVideoObject();
            com.tencent.mm.modelvideo.o.Nh();
            localObject3 = com.tencent.mm.modelvideo.s.mk(this.qvi.field_imgPath);
            localObject1 = localObject2;
            if (localObject3 != null)
            {
              ((WXVideoObject)localObject2).videoUrl = ((String)localObject3);
              this.filePath = ((String)localObject3);
              i = ((String)localObject3).lastIndexOf(".");
              localObject1 = localObject2;
              if (i >= 0)
              {
                localObject1 = localObject2;
                if (i < ((String)localObject3).length() - 1)
                {
                  this.hLy = ((String)localObject3).substring(i + 1);
                  localObject1 = localObject2;
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void ccP()
  {
    GMTrace.i(2311766147072L, 17224);
    Object localObject1 = new df();
    Object localObject2;
    int i;
    if (this.eFM)
    {
      localObject2 = getIntent().getExtras().getString("sns_send_data_ui_image_path");
      i = getIntent().getExtras().getInt("sns_send_data_ui_image_position");
      ((df)localObject1).eEK.eEM = this.kyP;
      ((df)localObject1).eEK.eEN = ((String)localObject2);
      ((df)localObject1).eEK.eEO = i;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      if (!((df)localObject1).eEL.eEu) {
        break label436;
      }
      localObject1 = ((df)localObject1).eEL.eEP;
      int j = ((List)localObject1).size();
      i = 0;
      label116:
      if (i >= j) {
        break label373;
      }
      localObject2 = new c();
      ((c)localObject2).eEl = ((String)((Map)((List)localObject1).get(i)).get("deviceType"));
      ((c)localObject2).deviceID = ((String)((Map)((List)localObject1).get(i)).get("deviceID"));
      ((c)localObject2).fMz = ((String)((Map)((List)localObject1).get(i)).get("displayName"));
      ((c)localObject2).iconUrl = ((String)((Map)((List)localObject1).get(i)).get("iconUrl"));
      ((c)localObject2).eFL = ((String)((Map)((List)localObject1).get(i)).get("ability"));
      ((c)localObject2).wBu = ((String)((Map)((List)localObject1).get(i)).get("abilityInf"));
      if ((!this.eFM) || (!a((c)localObject2, this.kyP))) {
        break label339;
      }
      this.wAT.add(localObject2);
    }
    for (;;)
    {
      i += 1;
      break label116;
      ((df)localObject1).eEK.eDr = this.fKQ;
      break;
      label339:
      if ((!this.eFM) && (a((c)localObject2, this.fKQ))) {
        this.wAT.add(localObject2);
      }
    }
    label373:
    if (this.wAT.size() > 0)
    {
      w.d("MicroMsg.ChattingSendDataToDeviceUI", "update data mListHardDeviceOnline");
      this.wAL.at(this.wAT);
      if (this.wAL.getCount() > 0)
      {
        this.wAQ.setText(R.l.deW);
        this.wAW = false;
      }
      this.wAL.notifyDataSetChanged();
    }
    label436:
    GMTrace.o(2311766147072L, 17224);
  }
  
  private void nc(int paramInt)
  {
    GMTrace.i(2311229276160L, 17220);
    if (this.eFM)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13197, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.wBa), "", Integer.valueOf(2), Integer.valueOf(this.wAZ) });
      GMTrace.o(2311229276160L, 17220);
      return;
    }
    com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
    int i = this.wBa;
    long l = this.fKQ;
    String str2 = "";
    at.AR();
    Object localObject = com.tencent.mm.y.c.yM().cM(l);
    String str1;
    if (((ce)localObject).field_msgId == 0L) {
      str1 = "";
    }
    for (;;)
    {
      localg.i(13197, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), str1, Integer.valueOf(1), Integer.valueOf(this.wAZ) });
      GMTrace.o(2311229276160L, 17220);
      return;
      String str3 = ((ce)localObject).field_content;
      str1 = str2;
      if (((ce)localObject).field_type == 49)
      {
        localObject = f.a.eS(str3);
        str1 = str2;
        if (localObject != null)
        {
          str1 = str2;
          if (((f.a)localObject).type == 6) {
            str1 = ((f.a)localObject).giw;
          }
        }
      }
    }
  }
  
  public final b ccQ()
  {
    GMTrace.i(2312974106624L, 17233);
    if (this.wAS == null) {
      this.wAS = new b();
    }
    b localb = this.wAS;
    GMTrace.o(2312974106624L, 17233);
    return localb;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2311363493888L, 17221);
    int i = R.i.ctn;
    GMTrace.o(2311363493888L, 17221);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2312705671168L, 17231);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.dnn, R.l.dno, 1);
    GMTrace.o(2312705671168L, 17231);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(2312168800256L, 17227);
    if (this.wBb.size() > 0)
    {
      i.a locala = new i.a(this);
      locala.BO(R.l.dhm);
      locala.BQ(R.l.dho).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2520340496384L, 18778);
          paramAnonymousDialogInterface = ChattingSendDataToDeviceUI.b(ChattingSendDataToDeviceUI.this).keySet().iterator();
          while (paramAnonymousDialogInterface.hasNext())
          {
            String str = (String)paramAnonymousDialogInterface.next();
            cu localcu = new cu();
            localcu.eEh.esG = str;
            com.tencent.mm.sdk.b.a.vgX.m(localcu);
          }
          ChattingSendDataToDeviceUI.this.finish();
          GMTrace.o(2520340496384L, 18778);
        }
      });
      locala.BR(R.l.dhn).b(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2170166444032L, 16169);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(2170166444032L, 16169);
        }
      });
      locala.aax().show();
      GMTrace.o(2312168800256L, 17227);
      return;
    }
    super.onBackPressed();
    GMTrace.o(2312168800256L, 17227);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(2311497711616L, 17222);
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = new df();
    if (this.eFM)
    {
      String str = getIntent().getExtras().getString("sns_send_data_ui_image_path");
      int i = getIntent().getExtras().getInt("sns_send_data_ui_image_position");
      paramConfiguration.eEK.eEM = this.kyP;
      paramConfiguration.eEK.eEN = str;
      paramConfiguration.eEK.eEO = i;
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.vgX.m(paramConfiguration);
      if ((paramConfiguration.eEL.eEu) && (this.wAT.size() > 0))
      {
        w.d("MicroMsg.ChattingSendDataToDeviceUI", "online device size %d", new Object[] { Integer.valueOf(this.wAT.size()) });
        this.wAL.at(this.wAT);
        if (this.wAL.getCount() > 0)
        {
          this.wAQ.setText(R.l.deW);
          this.wAW = false;
        }
        this.wAL.notifyDataSetChanged();
      }
      GMTrace.o(2311497711616L, 17222);
      return;
      paramConfiguration.eEK.eDr = this.fKQ;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 6;
    GMTrace.i(2311095058432L, 17219);
    super.onCreate(paramBundle);
    this.eFM = getIntent().getExtras().getBoolean("sns_send_data_ui_activity", false);
    w.i("MicroMsg.ChattingSendDataToDeviceUI", "isSnsMsg:" + this.eFM);
    if (!this.eFM)
    {
      this.fKQ = getIntent().getExtras().getLong("Retr_Msg_Id");
      if (this.fKQ != -1L)
      {
        at.AR();
        this.qvi = com.tencent.mm.y.c.yM().cM(this.fKQ);
        if ((this.qvi != null) && (this.qvi.field_msgId != 0L)) {
          break label549;
        }
      }
    }
    this.wAZ = getIntent().getExtras().getInt("exdevice_open_scene_type", 2);
    this.wAX = false;
    setFinishOnTouchOutside(true);
    this.wAT.clear();
    this.wBc.clear();
    this.wAO = ((RelativeLayout)findViewById(R.h.bQP));
    paramBundle = new com.tencent.mm.g.a.dh();
    label261:
    Object localObject;
    if (this.eFM)
    {
      this.kyP = getIntent().getExtras().getString("sns_local_id");
      if (this.kyP != null)
      {
        paramBundle.eEV.eEM = this.kyP;
        w.i("MicroMsg.ChattingSendDataToDeviceUI", "mSnsLocalId: %s", new Object[] { this.kyP });
      }
      com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
      if (!paramBundle.eEW.eEu) {
        break label1248;
      }
      this.wAR = Boolean.valueOf(true);
      com.tencent.mm.sdk.b.a.vgX.b(this.wBg);
      com.tencent.mm.sdk.b.a.vgX.b(this.wBh);
      this.wAO.setVisibility(0);
      this.tBi = ((HorizontalListView)findViewById(R.h.bKn));
      this.wAQ = ((TextView)findViewById(R.h.bfj));
      this.wAQ.setText(R.l.dhi);
      this.wAL = new a(this);
      this.tBi.setAdapter(this.wAL);
      this.tBi.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(2251502387200L, 16775);
          ChattingSendDataToDeviceUI.this.wAX = true;
          ChattingSendDataToDeviceUI.c localc = ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this).CM(paramAnonymousInt);
          String str1 = localc.eEl;
          paramAnonymousAdapterView = localc.deviceID;
          String str2 = localc.eFL;
          try
          {
            if (ChattingSendDataToDeviceUI.b(ChattingSendDataToDeviceUI.this).get(paramAnonymousAdapterView) != null)
            {
              w.e("MicroMsg.ChattingSendDataToDeviceUI", "ap: some file is sending");
              paramAnonymousView = new cu();
              paramAnonymousView.eEh.esG = paramAnonymousAdapterView;
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
              ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this, "send_data_cancel", paramAnonymousAdapterView, 0);
              localc.eFQ = "send_data_cancel";
              ChattingSendDataToDeviceUI.b(ChattingSendDataToDeviceUI.this).remove(paramAnonymousAdapterView);
              paramAnonymousAdapterView = (eo)((View)ChattingSendDataToDeviceUI.c(ChattingSendDataToDeviceUI.this).get(Integer.valueOf(paramAnonymousInt))).getTag();
              paramAnonymousAdapterView.wBp.setText(ChattingSendDataToDeviceUI.this.getText(R.l.dhl));
              paramAnonymousAdapterView.wBp.setTextColor(ChattingSendDataToDeviceUI.this.getResources().getColor(R.e.aOU));
              paramAnonymousAdapterView.wHx.setVisibility(8);
              paramAnonymousAdapterView.wHx.setProgress(0);
              GMTrace.o(2251502387200L, 16775);
              return;
            }
            localc.eFQ = "send_data_sending";
            ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).put(localc.deviceID, localc);
            ChattingSendDataToDeviceUI.b(ChattingSendDataToDeviceUI.this).put(paramAnonymousAdapterView, paramAnonymousView);
            ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this, "send_data_sending", paramAnonymousAdapterView, 1);
            ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this, 3);
            paramAnonymousView = new ea();
            paramAnonymousView.eFJ.esG = paramAnonymousAdapterView;
            paramAnonymousView.eFJ.eEl = str1;
            paramAnonymousView.eFJ.data = ChattingSendDataToDeviceUI.e(ChattingSendDataToDeviceUI.this);
            paramAnonymousView.eFJ.eFL = str2;
            if (ChattingSendDataToDeviceUI.this.eFM)
            {
              paramAnonymousView.eFJ.eEM = ChattingSendDataToDeviceUI.f(ChattingSendDataToDeviceUI.this);
              paramAnonymousView.eFJ.eFM = ChattingSendDataToDeviceUI.this.eFM;
            }
            for (;;)
            {
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
              if (!paramAnonymousView.eFK.eFN)
              {
                ChattingSendDataToDeviceUI.We("send_data_failed");
                w.e("MicroMsg.ChattingSendDataToDeviceUI", " e.result.isSuccess is false, send fail!");
              }
              GMTrace.o(2251502387200L, 16775);
              return;
              paramAnonymousView.eFJ.eDr = ChattingSendDataToDeviceUI.g(ChattingSendDataToDeviceUI.this);
            }
            return;
          }
          catch (Exception paramAnonymousAdapterView)
          {
            ChattingSendDataToDeviceUI.We("send_data_failed");
            w.e("MicroMsg.ChattingSendDataToDeviceUI", "send to device item click exception %s", new Object[] { paramAnonymousAdapterView });
            GMTrace.o(2251502387200L, 16775);
          }
        }
      });
      ccP();
      if (!this.eFM) {
        break label1058;
      }
      paramBundle = this.kyP;
      if (paramBundle == null) {
        break label1053;
      }
      localObject = new hq();
      ((hq)localObject).eKU.eEM = paramBundle;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      i = ((hq)localObject).eKV.eKW.uUc.ueV;
      if (i != 1) {
        break label1021;
      }
      i = 3;
      label463:
      this.wBa = i;
      nc(1);
    }
    for (;;)
    {
      this.wAP = ((RelativeLayout)findViewById(R.h.beE));
      this.wAJ = ((HorizontalListView)findViewById(R.h.beo));
      this.wAK = new c(this);
      this.wAJ.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(final AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(2231369728000L, 16625);
          w.i("MicroMsg.ChattingSendDataToDeviceUI", "onItemClick(%d).", new Object[] { Integer.valueOf(paramAnonymousInt) });
          if (paramAnonymousInt == paramAnonymousAdapterView.getAdapter().getCount() - 1)
          {
            paramAnonymousAdapterView = new Intent(ChattingSendDataToDeviceUI.this, Sort3rdAppUI.class);
            paramAnonymousAdapterView.addFlags(67108864);
            paramAnonymousAdapterView.putExtra("KFlag", ChattingSendDataToDeviceUI.h(ChattingSendDataToDeviceUI.this));
            ChattingSendDataToDeviceUI.this.startActivity(paramAnonymousAdapterView);
            GMTrace.o(2231369728000L, 16625);
            return;
          }
          if ((ChattingSendDataToDeviceUI.this.wrB) && (paramAnonymousInt == paramAnonymousAdapterView.getAdapter().getCount() - 2))
          {
            if ((ChattingSendDataToDeviceUI.this.filePath == null) || (ChattingSendDataToDeviceUI.this.hLy == null))
            {
              h.bm(ChattingSendDataToDeviceUI.this.getBaseContext(), ChattingSendDataToDeviceUI.this.getString(R.l.dnn));
              GMTrace.o(2231369728000L, 16625);
              return;
            }
            com.tencent.mm.pluginsdk.ui.tools.a.b(ChattingSendDataToDeviceUI.this, ChattingSendDataToDeviceUI.this.filePath, ChattingSendDataToDeviceUI.this.hLy.toLowerCase(), 1);
            GMTrace.o(2231369728000L, 16625);
            return;
          }
          if ((paramAnonymousInt >= 0) && (paramAnonymousInt < paramAnonymousAdapterView.getAdapter().getCount() - 1))
          {
            paramAnonymousAdapterView = (com.tencent.mm.pluginsdk.model.app.f)ChattingSendDataToDeviceUI.i(ChattingSendDataToDeviceUI.this).get(paramAnonymousInt);
            if (!com.tencent.mm.pluginsdk.model.app.g.a(ChattingSendDataToDeviceUI.this.getBaseContext(), paramAnonymousAdapterView))
            {
              h.bm(ChattingSendDataToDeviceUI.this.getBaseContext(), ChattingSendDataToDeviceUI.this.getString(R.l.dhk));
              paramAnonymousAdapterView.field_status = 4;
              an.aWy().a(paramAnonymousAdapterView, new String[0]);
              ChattingSendDataToDeviceUI.j(ChattingSendDataToDeviceUI.this);
              GMTrace.o(2231369728000L, 16625);
              return;
            }
            com.tencent.mm.bv.a.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17888673005568L, 133281);
                com.tencent.mm.pluginsdk.model.app.g.a(ChattingSendDataToDeviceUI.this.getBaseContext(), paramAnonymousAdapterView.field_packageName, ChattingSendDataToDeviceUI.this.wBf, paramAnonymousAdapterView.field_appId, paramAnonymousAdapterView.field_openId, 0, null, null);
                GMTrace.o(17888673005568L, 133281);
              }
            });
          }
          GMTrace.o(2231369728000L, 16625);
        }
      });
      this.wAJ.setAdapter(this.wAK);
      GMTrace.o(2311095058432L, 17219);
      return;
      label549:
      this.wAM = this.qvi.field_type;
      this.wqK = com.tencent.mm.y.s.eb(this.qvi.field_talker);
      this.wAN = this.qvi.field_content;
      int j;
      if ((this.wqK) && (this.qvi.field_isSend == 0))
      {
        localObject = this.qvi.field_content;
        j = this.qvi.field_isSend;
        paramBundle = (Bundle)localObject;
        if (this.wqK)
        {
          paramBundle = (Bundle)localObject;
          if (localObject != null)
          {
            paramBundle = (Bundle)localObject;
            if (j == 0) {
              paramBundle = bc.gQ((String)localObject);
            }
          }
        }
        this.wAN = paramBundle;
      }
      if (this.qvi.field_type == 49)
      {
        this.eRj = f.a.eS(this.wAN);
        if (this.eRj == null)
        {
          w.e("MicroMsg.ChattingSendDataToDeviceUI", "initParams content is null");
          break;
        }
        if (this.eRj.type == 3) {
          this.wAV = 16L;
        }
      }
      for (;;)
      {
        w.i("MicroMsg.ChattingSendDataToDeviceUI", "contentFlag: %s", new Object[] { Long.valueOf(this.wAV) });
        break;
        if (this.eRj.type == 4)
        {
          this.wAV = 8L;
        }
        else if (this.eRj.type == 5)
        {
          this.wAV = 32L;
        }
        else
        {
          if (this.eRj.type == 6)
          {
            paramBundle = b.a.NU(this.eRj.giw);
            if (paramBundle == null)
            {
              w.e("MicroMsg.ChattingSendDataToDeviceUI", "initParams TYPE_FILE getContentTypeFlag null");
              break;
            }
            this.wAV = paramBundle.longValue();
            continue;
          }
          if (this.eRj.type == 2)
          {
            this.wAV = 2L;
            paramBundle = n.IZ().n(this.qvi);
            if (paramBundle != null) {
              this.wAN = paramBundle.gHc;
            }
          }
          else
          {
            w.e("MicroMsg.ChattingSendDataToDeviceUI", "initParams APPMSG not support type");
            break;
            if (this.qvi.field_type == 3)
            {
              paramBundle = n.IZ().n(this.qvi);
              if (paramBundle != null) {
                this.wAN = paramBundle.gHc;
              }
            }
            for (;;)
            {
              paramBundle = b.a.NU(this.wAM);
              if (paramBundle != null) {
                break label996;
              }
              w.e("MicroMsg.ChattingSendDataToDeviceUI", "initParams not appmsg getContentTypeFlag null");
              break;
              if (this.qvi.field_type == 43)
              {
                paramBundle = com.tencent.mm.modelvideo.o.Nh().mh(this.qvi.field_imgPath);
                if (paramBundle != null) {
                  this.wAN = paramBundle.Nt();
                }
              }
            }
            label996:
            this.wAV = paramBundle.longValue();
          }
        }
      }
      paramBundle.eEV.eDr = this.fKQ;
      break label261;
      label1021:
      if (i == 4)
      {
        i = 1;
        break label463;
      }
      if (i == 15)
      {
        i = 6;
        break label463;
      }
      if (i == 3)
      {
        i = 5;
        break label463;
      }
      label1053:
      i = 0;
      break label463;
      label1058:
      long l = this.fKQ;
      if ((l == -1L) || (l == Long.MIN_VALUE)) {
        i = 0;
      }
      for (;;)
      {
        this.wBa = i;
        break;
        at.AR();
        paramBundle = com.tencent.mm.y.c.yM().cM(l);
        if (paramBundle.field_msgId != 0L)
        {
          j = paramBundle.field_type;
          localObject = paramBundle.field_content;
          if (!paramBundle.aCp()) {
            break label1218;
          }
          paramBundle = f.a.eS((String)localObject);
          if (paramBundle != null) {
            break label1157;
          }
          w.e("MicroMsg.ChattingSendDataToDeviceUI", "get content is null");
        }
        label1157:
        label1218:
        do
        {
          do
          {
            i = 0;
            break;
            if (paramBundle.type == 3)
            {
              i = 1;
              break;
            }
            if (paramBundle.type == 4) {
              break;
            }
            if (paramBundle.type == 6)
            {
              i = 4;
              break;
            }
            if (paramBundle.type == 2)
            {
              i = 3;
              break;
            }
          } while (paramBundle.type != 5);
          i = 5;
          break;
          if (j == 3)
          {
            i = 3;
            break;
          }
          if (j == 48)
          {
            i = 2;
            break;
          }
        } while (j != 62);
      }
      label1248:
      this.wAO.setVisibility(8);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2312839888896L, 17232);
    super.onDestroy();
    w.i("MicroMsg.ChattingSendDataToDeviceUI", "onDestroy...");
    this.wAY = false;
    if (this.wAR.booleanValue())
    {
      if (!this.wAX) {
        nc(2);
      }
      com.tencent.mm.sdk.b.a.vgX.c(this.wBg);
      com.tencent.mm.sdk.b.a.vgX.c(this.wBh);
      en localen = new en();
      com.tencent.mm.sdk.b.a.vgX.m(localen);
      if (localen.eGk.eFN) {
        w.i("MicroMsg.ChattingSendDataToDeviceUI", "Stop scan Network success!");
      }
    }
    com.tencent.mm.sdk.platformtools.a.cX(getWindow().getDecorView());
    com.tencent.mm.sdk.platformtools.a.ek(this);
    GMTrace.o(2312839888896L, 17232);
  }
  
  protected void onPause()
  {
    GMTrace.i(2312571453440L, 17230);
    super.onPause();
    GMTrace.o(2312571453440L, 17230);
  }
  
  protected void onResume()
  {
    GMTrace.i(2312437235712L, 17229);
    super.onResume();
    ccO();
    RelativeLayout.LayoutParams localLayoutParams;
    int i;
    float f;
    if (this.wAR.booleanValue())
    {
      localLayoutParams = (RelativeLayout.LayoutParams)this.tBi.getLayoutParams();
      i = localLayoutParams.height;
      f = com.tencent.mm.br.a.dZ(this);
      if (f != 1.125F) {
        break label90;
      }
    }
    for (localLayoutParams.height = (i + getResources().getDimensionPixelSize(R.f.aQu));; localLayoutParams.height = (i + getResources().getDimensionPixelSize(R.f.aQE))) {
      label90:
      do
      {
        this.tBi.setLayoutParams(localLayoutParams);
        GMTrace.o(2312437235712L, 17229);
        return;
      } while ((f != 1.375F) && (f != 1.25F) && (f != 1.625F));
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private Context context;
    private com.tencent.mm.ao.a.a.c kEK;
    private Map<String, ChattingSendDataToDeviceUI.c> wBq;
    private List<Map<String, ChattingSendDataToDeviceUI.c>> wrA;
    
    public a(Context paramContext)
    {
      GMTrace.i(2407194951680L, 17935);
      this.context = paramContext;
      this.wrA = new ArrayList();
      this$1 = new c.a();
      ChattingSendDataToDeviceUI.this.gKR = R.g.aYh;
      this.kEK = ChattingSendDataToDeviceUI.this.Jn();
      GMTrace.o(2407194951680L, 17935);
    }
    
    public final ChattingSendDataToDeviceUI.c CM(int paramInt)
    {
      GMTrace.i(2407597604864L, 17938);
      ChattingSendDataToDeviceUI.c localc = (ChattingSendDataToDeviceUI.c)((Map)this.wrA.get(paramInt)).get("hard_device_info");
      GMTrace.o(2407597604864L, 17938);
      return localc;
    }
    
    public final void at(List<ChattingSendDataToDeviceUI.c> paramList)
    {
      GMTrace.i(2407329169408L, 17936);
      this.wrA.clear();
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        this.wBq = new HashMap();
        this.wBq.put("hard_device_info", paramList.get(i));
        this.wrA.add(this.wBq);
        i += 1;
      }
      GMTrace.o(2407329169408L, 17936);
    }
    
    public final int getCount()
    {
      GMTrace.i(2407463387136L, 17937);
      int i = this.wrA.size();
      GMTrace.o(2407463387136L, 17937);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(2407731822592L, 17939);
      long l = paramInt;
      GMTrace.o(2407731822592L, 17939);
      return l;
    }
    
    public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2407866040320L, 17940);
      ChattingSendDataToDeviceUI.c localc = CM(paramInt);
      w.d("MicroMsg.ChattingSendDataToDeviceUI", "position = %d, getCount() = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(getCount()) });
      final int i;
      final int j;
      StringBuffer localStringBuffer;
      float f;
      label264:
      int k;
      label267:
      String str2;
      if (ChattingSendDataToDeviceUI.c(ChattingSendDataToDeviceUI.this).get(Integer.valueOf(paramInt)) == null)
      {
        paramView = new eo();
        paramViewGroup = View.inflate(paramViewGroup.getContext(), R.i.cFQ, null);
        paramView.kHP = paramViewGroup.findViewById(R.h.brL);
        paramView.jUm = ((TextView)paramViewGroup.findViewById(R.h.bPo));
        paramView.iub = ((ImageView)paramViewGroup.findViewById(R.h.bGn));
        paramView.wBp = ((TextView)paramViewGroup.findViewById(R.h.ccb));
        paramView.wHx = ((SendDataToDeviceProgressBar)paramViewGroup.findViewById(R.h.cca));
        paramView.wHx.setVisibility(4);
        ChattingSendDataToDeviceUI.c(ChattingSendDataToDeviceUI.this).put(Integer.valueOf(paramInt), paramViewGroup);
        paramViewGroup.setTag(paramView);
        ChattingSendDataToDeviceUI.k(ChattingSendDataToDeviceUI.this).put(localc.deviceID, Integer.valueOf(paramInt));
        String str1 = localc.fMz;
        i = 8;
        j = 0;
        localObject = new StringBuffer();
        localStringBuffer = new StringBuffer();
        f = com.tencent.mm.br.a.dZ(this.context);
        if ((f != 1.125F) && (f != 1.25F)) {
          break label374;
        }
        i = 6;
        k = 0;
        if (k >= str1.length()) {
          break label419;
        }
        int m = Character.codePointAt(str1, k);
        str2 = str1.substring(k, k + 1);
        if ((m < 0) || (m > 255)) {
          break label398;
        }
        j += 1;
        label318:
        if (j > i) {
          break label407;
        }
        localObject = ((StringBuffer)localObject).append(str2);
      }
      for (;;)
      {
        k += 1;
        break label267;
        paramViewGroup = (View)ChattingSendDataToDeviceUI.c(ChattingSendDataToDeviceUI.this).get(Integer.valueOf(paramInt));
        paramView = (eo)paramViewGroup.getTag();
        break;
        label374:
        if ((f != 1.375F) && (f != 1.625F)) {
          break label264;
        }
        i = 5;
        break label264;
        label398:
        j += 2;
        break label318;
        label407:
        localStringBuffer = localStringBuffer.append(str2);
      }
      label419:
      paramView.jUm.setText(((StringBuffer)localObject).toString());
      if (j >= i) {
        paramView.wBp.setText(localStringBuffer);
      }
      final Object localObject = null;
      if (ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).containsKey(CM(paramInt).deviceID)) {
        localObject = (ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).get(CM(paramInt).deviceID);
      }
      if ((localObject != null) && (((ChattingSendDataToDeviceUI.c)localObject).eFQ != null))
      {
        w.d("MicroMsg.ChattingSendDataToDeviceUI", "position(%s), sendState(%s).", new Object[] { Integer.valueOf(paramInt), ((ChattingSendDataToDeviceUI.c)localObject).eFQ });
        if (!((ChattingSendDataToDeviceUI.c)localObject).eFQ.equals("send_data_sending")) {
          break label752;
        }
        paramView.wBp.setText(this.context.getString(R.l.dht));
        paramView.wBp.setTextColor(this.context.getResources().getColor(R.e.aOV));
        paramView.wHx.setProgress(localc.progress);
        paramView.wHx.setVisibility(0);
        localObject = localc.deviceID;
        localObject = (ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).get(localObject);
        j = ((ChattingSendDataToDeviceUI.c)localObject).progress;
        if (j < 100) {
          break label738;
        }
        i = 0;
        e.b(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2209626456064L, 16463);
            int i = j + 1;
            int j;
            while (ChattingSendDataToDeviceUI.this.wAY)
            {
              if (i >= 100) {
                j = i;
              }
              try
              {
                if (localObject.eFQ.equals("send_data_sucess"))
                {
                  j = i;
                  ChattingSendDataToDeviceUI.this.runOnUiThread(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(2174192975872L, 16199);
                      ChattingSendDataToDeviceUI.a.1.this.wBk.wHx.setProgress(0);
                      ChattingSendDataToDeviceUI.a.1.this.wBk.wHx.setVisibility(4);
                      ChattingSendDataToDeviceUI.a.1.this.wBk.wBp.setText(ChattingSendDataToDeviceUI.this.getText(R.l.dhr));
                      ChattingSendDataToDeviceUI.a.1.this.wBk.wBp.setTextColor(ChattingSendDataToDeviceUI.this.getResources().getColor(R.e.aOV));
                      ChattingSendDataToDeviceUI.a.1.this.wBl.eFQ = "send_data_sucess";
                      ChattingSendDataToDeviceUI.a.1.this.wBl.progress = 0;
                      ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).put(ChattingSendDataToDeviceUI.a.1.this.wBl.deviceID, ChattingSendDataToDeviceUI.a.1.this.wBl);
                      w.i("MicroMsg.ChattingSendDataToDeviceUI", " deviceId %s SEND_DATA_SUCCESS!", new Object[] { ChattingSendDataToDeviceUI.a.1.this.wBl.deviceID });
                      GMTrace.o(2174192975872L, 16199);
                    }
                  });
                  GMTrace.o(2209626456064L, 16463);
                  return;
                }
                j = i;
                if (!localObject.eFQ.equals("send_data_failed")) {
                  continue;
                }
                j = i;
                ChattingSendDataToDeviceUI.this.runOnUiThread(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(2370687729664L, 17663);
                    ChattingSendDataToDeviceUI.a.1.this.wBk.wHx.setProgress(0);
                    ChattingSendDataToDeviceUI.a.1.this.wBk.wHx.setVisibility(4);
                    ChattingSendDataToDeviceUI.a.1.this.wBk.wBp.setText(ChattingSendDataToDeviceUI.this.getText(R.l.dhp));
                    ChattingSendDataToDeviceUI.a.1.this.wBk.wBp.setTextColor(ChattingSendDataToDeviceUI.this.getResources().getColor(R.e.aOW));
                    ChattingSendDataToDeviceUI.a.1.this.wBl.eFQ = "send_data_failed";
                    ChattingSendDataToDeviceUI.a.1.this.wBl.progress = 0;
                    ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).put(ChattingSendDataToDeviceUI.a.1.this.wBl.deviceID, ChattingSendDataToDeviceUI.a.1.this.wBl);
                    w.i("MicroMsg.ChattingSendDataToDeviceUI", " deviceId %s SEND_DATA_FAILED!", new Object[] { ChattingSendDataToDeviceUI.a.1.this.wBl.deviceID });
                    GMTrace.o(2370687729664L, 17663);
                  }
                });
                GMTrace.o(2209626456064L, 16463);
                return;
              }
              catch (Exception localException)
              {
                w.d("MicroMsg.ChattingSendDataToDeviceUI", "setSendingProgress exception %s", new Object[] { localException });
                i = j;
              }
              j = i;
              paramView.wHx.setProgress(i);
              j = i;
              localObject.progress = i;
              i += 1;
              j = i;
              Thread.sleep(i);
            }
            GMTrace.o(2209626456064L, 16463);
          }
        }, "SendDataState_handler").start();
      }
      for (;;)
      {
        w.d("MicroMsg.ChattingSendDataToDeviceUI", "position(%s), name(%s).", new Object[] { Integer.valueOf(paramInt), localc.fMz });
        n.Jd().a(localc.iconUrl, paramView.iub, this.kEK);
        paramView.kHP.setTag(Integer.valueOf(paramInt));
        GMTrace.o(2407866040320L, 17940);
        return paramViewGroup;
        label738:
        i = 500 / (100 - j);
        break;
        label752:
        if (((ChattingSendDataToDeviceUI.c)localObject).eFQ.equals("send_data_sucess"))
        {
          paramView.wBp.setText(this.context.getString(R.l.dhr));
          paramView.wBp.setTextColor(this.context.getResources().getColor(R.e.aOV));
          paramView.wHx.setVisibility(4);
        }
        else if (((ChattingSendDataToDeviceUI.c)localObject).eFQ.equals("send_data_cancel"))
        {
          paramView.wBp.setText(this.context.getString(R.l.dhl));
          paramView.wBp.setTextColor(this.context.getResources().getColor(R.e.aOU));
          paramView.wHx.setVisibility(4);
        }
        else if (((ChattingSendDataToDeviceUI.c)localObject).eFQ.equals("send_data_failed"))
        {
          paramView.wBp.setText(this.context.getString(R.l.dhp));
          paramView.wBp.setTextColor(this.context.getResources().getColor(R.e.aOW));
          paramView.wHx.setVisibility(4);
        }
      }
    }
  }
  
  public final class b
  {
    public b()
    {
      GMTrace.i(2162918686720L, 16115);
      GMTrace.o(2162918686720L, 16115);
    }
    
    public final boolean n(com.tencent.mm.sdk.b.b paramb)
    {
      GMTrace.i(2163052904448L, 16116);
      Object localObject1;
      int i;
      Object localObject2;
      if ((paramb instanceof dx))
      {
        paramb = ((dx)paramb).eFD.eEP;
        localObject1 = new ArrayList();
        i = 0;
        while (i < paramb.size())
        {
          localObject2 = new ChattingSendDataToDeviceUI.c(ChattingSendDataToDeviceUI.this);
          ((ChattingSendDataToDeviceUI.c)localObject2).eEl = ((String)((Map)paramb.get(i)).get("deviceType"));
          ((ChattingSendDataToDeviceUI.c)localObject2).deviceID = ((String)((Map)paramb.get(i)).get("deviceID"));
          ((ChattingSendDataToDeviceUI.c)localObject2).fMz = ((String)((Map)paramb.get(i)).get("displayName"));
          ((ChattingSendDataToDeviceUI.c)localObject2).iconUrl = ((String)((Map)paramb.get(i)).get("iconUrl"));
          ((ChattingSendDataToDeviceUI.c)localObject2).eFL = ((String)((Map)paramb.get(i)).get("ability"));
          ((ChattingSendDataToDeviceUI.c)localObject2).wBu = ((String)((Map)paramb.get(i)).get("abilityInf"));
          if (((ChattingSendDataToDeviceUI.this.eFM) && (ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this, (ChattingSendDataToDeviceUI.c)localObject2, ChattingSendDataToDeviceUI.f(ChattingSendDataToDeviceUI.this)))) || ((!ChattingSendDataToDeviceUI.this.eFM) && (ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this, (ChattingSendDataToDeviceUI.c)localObject2, ChattingSendDataToDeviceUI.g(ChattingSendDataToDeviceUI.this)))))
          {
            if ((ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).containsKey(((ChattingSendDataToDeviceUI.c)localObject2).deviceID)) && (((ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).get(((ChattingSendDataToDeviceUI.c)localObject2).deviceID)).eFQ != null))
            {
              ((ChattingSendDataToDeviceUI.c)localObject2).eFQ = ((ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).get(((ChattingSendDataToDeviceUI.c)localObject2).deviceID)).eFQ;
              ((ChattingSendDataToDeviceUI.c)localObject2).progress = ((ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).get(((ChattingSendDataToDeviceUI.c)localObject2).deviceID)).progress;
            }
            ((List)localObject1).add(localObject2);
          }
          i += 1;
        }
        if (ChattingSendDataToDeviceUI.l(ChattingSendDataToDeviceUI.this).size() != ((List)localObject1).size())
        {
          ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this, (List)localObject1);
          ChattingSendDataToDeviceUI.this.runOnUiThread(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2373237866496L, 17682);
              ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this).at(ChattingSendDataToDeviceUI.l(ChattingSendDataToDeviceUI.this));
              if (ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this).getCount() > 0)
              {
                ChattingSendDataToDeviceUI.m(ChattingSendDataToDeviceUI.this).setText(R.l.deW);
                ChattingSendDataToDeviceUI.n(ChattingSendDataToDeviceUI.this);
              }
              ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this).notifyDataSetChanged();
              GMTrace.o(2373237866496L, 17682);
            }
          });
        }
        GMTrace.o(2163052904448L, 16116);
        return true;
      }
      if ((paramb instanceof eb))
      {
        localObject1 = (eb)paramb;
        localObject2 = ((eb)localObject1).eFO.eFQ;
        paramb = ((eb)localObject1).eFO.esG;
        if (((String)localObject2).equals("send_data_sending")) {
          ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this, "send_data_sending", paramb, ((eb)localObject1).eFO.progress);
        }
        do
        {
          for (;;)
          {
            GMTrace.o(2163052904448L, 16116);
            return true;
            if (!((String)localObject2).equals("send_data_failed")) {
              break;
            }
            ChattingSendDataToDeviceUI.a(ChattingSendDataToDeviceUI.this, "send_data_failed", paramb, 0);
          }
        } while (!((String)localObject2).equals("send_data_sucess"));
        localObject1 = ChattingSendDataToDeviceUI.this;
        for (;;)
        {
          int j;
          try
          {
            i = ((Integer)((ChattingSendDataToDeviceUI)localObject1).wBe.get(paramb)).intValue();
            localObject2 = (eo)((View)((ChattingSendDataToDeviceUI)localObject1).wBd.get(Integer.valueOf(i))).getTag();
            w.d("MicroMsg.ChattingSendDataToDeviceUI", "set progress to success now: %s deviceId %s", new Object[] { Integer.valueOf(((eo)localObject2).wHx.getProgress()), paramb });
            ChattingSendDataToDeviceUI.c localc = (ChattingSendDataToDeviceUI.c)((ChattingSendDataToDeviceUI)localObject1).wBc.get(paramb);
            ((ChattingSendDataToDeviceUI)localObject1).runOnUiThread(new ChattingSendDataToDeviceUI.7((ChattingSendDataToDeviceUI)localObject1, (eo)localObject2, localc));
            j = Math.abs(((eo)localObject2).wHx.getProgress());
            localc.progress = j;
            if (j < 100) {
              break label760;
            }
            i = 0;
            w.d("MicroMsg.ChattingSendDataToDeviceUI", "sleepTime %d", new Object[] { Integer.valueOf(i) });
            e.b(new ChattingSendDataToDeviceUI.8((ChattingSendDataToDeviceUI)localObject1, j, (eo)localObject2, paramb, localc, i), "progressSuccess_handler").start();
            ((ChattingSendDataToDeviceUI)localObject1).wBc.put(localc.deviceID, localc);
          }
          catch (Exception paramb)
          {
            w.e("MicroMsg.ChattingSendDataToDeviceUI", "ap: set progress to success exception %s", new Object[] { paramb });
          }
          break;
          label760:
          i = 500 / (100 - j);
        }
      }
      GMTrace.o(2163052904448L, 16116);
      return true;
    }
  }
  
  public final class c
  {
    String deviceID;
    String eEl;
    String eFL;
    String eFQ;
    String fMz;
    String iconUrl;
    int progress;
    String wBu;
    
    public c()
    {
      GMTrace.i(2169361137664L, 16163);
      GMTrace.o(2169361137664L, 16163);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ChattingSendDataToDeviceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */