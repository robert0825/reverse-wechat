package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.li;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.model.app.ab;
import com.tencent.mm.pluginsdk.model.app.ab.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.y;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.io.File;

public class AppAttachDownloadUI
  extends MMActivity
  implements com.tencent.mm.ad.e, ab.a, j.a
{
  private long eDr;
  private String eMI;
  private boolean eON;
  private String eQH;
  private au eRz;
  private String euR;
  private String giJ;
  private String hLy;
  private ProgressBar jeL;
  private f kmX;
  private int lLR;
  private Button lhH;
  private View lhL;
  private Button ltK;
  private String mediaId;
  private String mhJ;
  private MMImageView nUc;
  private ImageView nUd;
  private ab toa;
  private TextView vWa;
  private View wqH;
  private TextView wqI;
  private TextView wqJ;
  private boolean wqK;
  private f.a wqL;
  private boolean wqM;
  private boolean wqN;
  private boolean wqO;
  private int wqP;
  private LinearLayout wqQ;
  private LinearLayout wqR;
  
  public AppAttachDownloadUI()
  {
    GMTrace.i(2190299103232L, 16319);
    this.wqM = false;
    this.wqN = false;
    this.wqO = true;
    this.wqP = 5000;
    GMTrace.o(2190299103232L, 16319);
  }
  
  private static boolean a(com.tencent.mm.pluginsdk.model.app.b paramb)
  {
    GMTrace.i(14925011353600L, 111200);
    if (paramb == null)
    {
      GMTrace.o(14925011353600L, 111200);
      return false;
    }
    File localFile = new File(paramb.field_fileFullPath);
    if ((localFile.exists()) && (localFile.length() == paramb.field_totalLen))
    {
      GMTrace.o(14925011353600L, 111200);
      return true;
    }
    GMTrace.o(14925011353600L, 111200);
    return false;
  }
  
  private boolean cbC()
  {
    int i = -1;
    GMTrace.i(2191238627328L, 16326);
    Object localObject1 = cbD();
    Object localObject2;
    long l1;
    long l2;
    long l3;
    String str1;
    long l4;
    boolean bool1;
    label285:
    String str2;
    boolean bool2;
    long l5;
    if (localObject1 == null)
    {
      com.tencent.mm.pluginsdk.model.app.l.b(this.eDr, this.eQH, null);
      localObject2 = cbD();
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        l1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).vmr;
        l2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_totalLen;
        localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
        l3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_type;
        str1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_mediaId;
        l4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_msgInfoId;
        bool1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload;
        if (((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature == null)
        {
          w.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), localObject1, Long.valueOf(l3), str1, Long.valueOf(l4), Boolean.valueOf(bool1), Integer.valueOf(i) });
          if (this.wqL.giz == 0)
          {
            localObject1 = localObject2;
            if (this.wqL.giv <= 26214400) {
              break label507;
            }
          }
          if (t.nm(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature)) {
            break label285;
          }
        }
        for (bool1 = true;; bool1 = false)
        {
          if (!bool1) {
            at.wS().a(new y((com.tencent.mm.pluginsdk.model.app.b)localObject2, this.giJ, this.mhJ, this.euR, this.hLy, this.eMI), 0);
          }
          GMTrace.o(2191238627328L, 16326);
          return bool1;
          i = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature.length();
          break;
        }
      }
    }
    else
    {
      localObject2 = new File(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath);
      if ((((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_status == 199L) && (!((File)localObject2).exists()))
      {
        w.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo info exist but file not!");
        com.tencent.mm.pluginsdk.model.app.l.b(this.eDr, this.eQH, null);
      }
      l1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).vmr;
      l2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_totalLen;
      str1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath;
      l3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_type;
      str2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_mediaId;
      l4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_msgInfoId;
      bool1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_isUpload;
      bool2 = ((File)localObject2).exists();
      l5 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_status;
      if (((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_signature != null) {
        break label517;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), str1, Long.valueOf(l3), str2, Long.valueOf(l4), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(l5), Integer.valueOf(i) });
      label507:
      bool1 = true;
      localObject2 = localObject1;
      break;
      label517:
      i = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_signature.length();
    }
  }
  
  private com.tencent.mm.pluginsdk.model.app.b cbD()
  {
    GMTrace.i(2191507062784L, 16328);
    final com.tencent.mm.pluginsdk.model.app.b localb1 = an.afP().eq(this.eDr);
    if (localb1 != null)
    {
      w.i("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo by msgId [%d] stack[%s]", new Object[] { Long.valueOf(this.eDr), t.Py() });
      GMTrace.o(2191507062784L, 16328);
      return localb1;
    }
    localb1 = com.tencent.mm.pluginsdk.model.app.l.OA(this.mediaId);
    if (localb1 == null)
    {
      w.i("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo by msgId and mediaId is null stack[%s]", new Object[] { t.Py() });
      GMTrace.o(2191507062784L, 16328);
      return localb1;
    }
    if ((localb1.field_msgInfoId == this.eDr) || (com.tencent.mm.a.e.aZ(localb1.field_fileFullPath)))
    {
      GMTrace.o(2191507062784L, 16328);
      return localb1;
    }
    com.tencent.mm.pluginsdk.model.app.l.b(this.eDr, this.eQH, null);
    final com.tencent.mm.pluginsdk.model.app.b localb2 = an.afP().eq(this.eDr);
    if (localb2 == null)
    {
      w.w("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo create new info from local but failed stack[%s]", new Object[] { t.Py() });
      GMTrace.o(2191507062784L, 16328);
      return localb1;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2378203922432L, 17719);
        long l1 = System.currentTimeMillis();
        long l2 = com.tencent.mm.a.e.o(localb1.field_fileFullPath, localb2.field_fileFullPath);
        if (l2 > 0L)
        {
          localb2.field_offset = l2;
          if (AppAttachDownloadUI.b(localb2)) {
            localb2.field_status = 199L;
          }
        }
        for (boolean bool = an.afP().c(localb2, new String[0]);; bool = false)
        {
          w.i("MicroMsg.AppAttachDownloadUI", "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms", new Object[] { Long.valueOf(l2), Long.valueOf(localb1.field_msgInfoId), Long.valueOf(localb2.field_msgInfoId), Boolean.valueOf(bool), Long.valueOf(localb2.field_status), Long.valueOf(System.currentTimeMillis() - l1) });
          GMTrace.o(2378203922432L, 17719);
          return;
        }
      }
    }, "copyAttachFromLocal");
    GMTrace.o(2191507062784L, 16328);
    return localb1;
  }
  
  private void cbE()
  {
    GMTrace.i(2191909715968L, 16331);
    switch (this.lLR)
    {
    case 1: 
    case 3: 
    case 4: 
    case 5: 
    default: 
      this.lhH.setVisibility(0);
      this.lhL.setVisibility(8);
      this.wqH.setVisibility(8);
    case 0: 
    case 6: 
    case 2: 
      do
      {
        do
        {
          GMTrace.o(2191909715968L, 16331);
          return;
        } while (!cbF());
        if (bg.SM(this.hLy))
        {
          localObject = cbD();
          Intent localIntent = new Intent(this, ShowImageUI.class);
          localIntent.putExtra("key_message_id", this.eRz.field_msgId);
          localIntent.putExtra("key_image_path", ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath);
          localIntent.putExtra("key_favorite", true);
          startActivity(localIntent);
          finish();
          GMTrace.o(2191909715968L, 16331);
          return;
        }
        localObject = getMimeType();
        this.vWa.setVisibility(0);
        this.lhL.setVisibility(8);
        this.wqH.setVisibility(8);
        this.ltK.setVisibility(8);
        this.wqJ.setVisibility(0);
        if (this.euR.equals("")) {
          this.wqJ.setText(getString(R.l.dNl));
        }
        while ((localObject == null) || (((String)localObject).equals("")))
        {
          this.lhH.setVisibility(8);
          this.vWa.setText(getString(R.l.dnh));
          GMTrace.o(2191909715968L, 16331);
          return;
          this.wqJ.setText(this.euR);
        }
        this.lhH.setVisibility(0);
        this.vWa.setText(getString(R.l.dni));
        GMTrace.o(2191909715968L, 16331);
        return;
      } while (!cbF());
      localObject = new Intent(this, ImageGalleryUI.class);
      ((Intent)localObject).putExtra("img_gallery_msg_id", this.eRz.field_msgId);
      ((Intent)localObject).putExtra("img_gallery_talker", this.eRz.field_talker);
      startActivity((Intent)localObject);
      finish();
      overridePendingTransition(0, 0);
      GMTrace.o(2191909715968L, 16331);
      return;
    }
    Object localObject = new Intent();
    ((Intent)localObject).putExtra("App_MsgId", this.eDr);
    setResult(-1, (Intent)localObject);
    finish();
    GMTrace.o(2191909715968L, 16331);
  }
  
  private boolean cbF()
  {
    GMTrace.i(2192043933696L, 16332);
    com.tencent.mm.pluginsdk.model.app.b localb = cbD();
    if (localb == null)
    {
      GMTrace.o(2192043933696L, 16332);
      return true;
    }
    if (com.tencent.mm.a.e.aZ(localb.field_fileFullPath))
    {
      this.lhL.setVisibility(8);
      this.wqH.setVisibility(8);
      this.ltK.setVisibility(8);
      GMTrace.o(2192043933696L, 16332);
      return true;
    }
    this.wqQ.setVisibility(8);
    this.wqR.setVisibility(0);
    GMTrace.o(2192043933696L, 16332);
    return false;
  }
  
  private String getMimeType()
  {
    GMTrace.i(2191372845056L, 16327);
    f.a locala = f.a.eS(this.eQH);
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (locala.giw != null)
    {
      localObject1 = localObject2;
      if (locala.giw.length() > 0) {
        localObject1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(locala.giw);
      }
    }
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (((String)localObject1).length() != 0) {}
    }
    else
    {
      w.w("MicroMsg.AppAttachDownloadUI", "getMimeType fail, not a built-in mimetype, use \"*/{fileext}\" instead");
      localObject2 = "*/" + locala.giw;
    }
    GMTrace.o(2191372845056L, 16327);
    return (String)localObject2;
  }
  
  private void init()
  {
    GMTrace.i(2190567538688L, 16321);
    oM(R.l.bvk);
    this.eDr = getIntent().getLongExtra("app_msg_id", -1L);
    boolean bool;
    if (this.eDr == -1L) {
      bool = false;
    }
    while (!bool)
    {
      finish();
      GMTrace.o(2190567538688L, 16321);
      return;
      at.AR();
      this.eRz = com.tencent.mm.y.c.yM().cM(this.eDr);
      if ((this.eRz == null) || (this.eRz.field_msgId == 0L) || (this.eRz.field_content == null))
      {
        bool = false;
      }
      else
      {
        this.wqK = s.eb(this.eRz.field_talker);
        this.eQH = this.eRz.field_content;
        if ((this.wqK) && (this.eRz.field_isSend == 0))
        {
          String str = this.eRz.field_content;
          localObject = str;
          if (this.wqK)
          {
            localObject = str;
            if (str != null) {
              localObject = bc.gQ(str);
            }
          }
          this.eQH = ((String)localObject);
        }
        this.wqL = f.a.eS(this.eQH);
        if (this.wqL == null)
        {
          w.e("MicroMsg.AppAttachDownloadUI", "summerapp parse msgContent error, %s", new Object[] { this.eQH });
          bool = false;
        }
        else
        {
          if ((t.nm(this.wqL.eAE)) && (!t.nm(this.wqL.giC)))
          {
            w.e("MicroMsg.AppAttachDownloadUI", "summerapp msgContent format error, %s", new Object[] { this.eQH });
            this.wqL.eAE = this.wqL.giC.hashCode();
          }
          this.lLR = this.wqL.type;
          this.mediaId = this.wqL.eAE;
          this.euR = t.nl(this.wqL.title);
          this.hLy = t.nl(this.wqL.giw).toLowerCase();
          this.mhJ = t.nl(this.wqL.filemd5);
          this.eMI = t.nl(this.wqL.eMI);
          this.giJ = t.nl(this.wqL.giJ);
          w.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams msgId[%d], sender[%d], msgContent[%s], appType[%d], mediaId[%s], fileName[%s]", new Object[] { Long.valueOf(this.eDr), Integer.valueOf(this.eRz.field_isSend), this.eQH, Integer.valueOf(this.lLR), this.mediaId, this.euR });
          localObject = cbD();
          if (localObject == null)
          {
            w.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams attInfo is null");
            this.wqN = false;
            if (a((com.tencent.mm.pluginsdk.model.app.b)localObject)) {
              bool = com.tencent.mm.pluginsdk.ui.tools.a.a(this, ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath, this.hLy, 1);
            }
          }
          else
          {
            new File(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath);
            if (((com.tencent.mm.pluginsdk.model.app.b)localObject).field_offset > 0L) {}
            for (this.wqN = true;; this.wqN = false)
            {
              w.i("MicroMsg.AppAttachDownloadUI", "summerapp initParams attInfo field_fileFullPath[%s], field_offset[%d], isDownloadStarted[%b]", new Object[] { ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath, Long.valueOf(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_offset), Boolean.valueOf(this.wqN) });
              break;
            }
          }
          bool = true;
        }
      }
    }
    Object localObject = new File(com.tencent.mm.compatible.util.e.fRX);
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdir();
    }
    an.afP().c(this);
    MP();
    GMTrace.o(2190567538688L, 16321);
  }
  
  protected final void MP()
  {
    GMTrace.i(2191104409600L, 16325);
    this.nUc = ((MMImageView)findViewById(R.h.bvl));
    this.lhL = findViewById(R.h.bvc);
    this.jeL = ((ProgressBar)findViewById(R.h.bvb));
    this.nUd = ((ImageView)findViewById(R.h.bvg));
    this.ltK = ((Button)findViewById(R.h.buQ));
    this.lhH = ((Button)findViewById(R.h.bva));
    this.wqH = findViewById(R.h.buR);
    this.vWa = ((TextView)findViewById(R.h.buX));
    this.wqI = ((TextView)findViewById(R.h.buS));
    this.wqJ = ((TextView)findViewById(R.h.buW));
    this.wqQ = ((LinearLayout)findViewById(R.h.buY));
    this.wqR = ((LinearLayout)findViewById(R.h.bKu));
    this.nUd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2296062672896L, 17107);
        AppAttachDownloadUI.k(AppAttachDownloadUI.this).setVisibility(8);
        AppAttachDownloadUI.l(AppAttachDownloadUI.this).setVisibility(0);
        AppAttachDownloadUI.m(AppAttachDownloadUI.this).setVisibility(8);
        w.i("MicroMsg.AppAttachDownloadUI", "summerapp stopBtn downloadAppAttachScene[%s]", new Object[] { AppAttachDownloadUI.a(AppAttachDownloadUI.this) });
        if (AppAttachDownloadUI.a(AppAttachDownloadUI.this) != null)
        {
          paramAnonymousView = AppAttachDownloadUI.a(AppAttachDownloadUI.this);
          AppAttachDownloadUI localAppAttachDownloadUI = AppAttachDownloadUI.this;
          if (!paramAnonymousView.too)
          {
            com.tencent.mm.modelcdntran.g.Gk().jz(paramAnonymousView.gIp);
            paramAnonymousView.toi = an.afP().Op(paramAnonymousView.mediaId);
          }
          w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig pause listener[%s], info[%s], justSaveFile[%b], stack[%s]", new Object[] { localAppAttachDownloadUI, paramAnonymousView.toi, Boolean.valueOf(paramAnonymousView.too), bg.bQW() });
          if (paramAnonymousView.toi != null)
          {
            if ((paramAnonymousView.toi.field_status == 101L) && (localAppAttachDownloadUI != null)) {
              localAppAttachDownloadUI.bJE();
            }
            paramAnonymousView.toi.field_status = 102L;
            if (!paramAnonymousView.too) {
              an.afP().c(paramAnonymousView.toi, new String[0]);
            }
          }
          h.wS().c(AppAttachDownloadUI.a(AppAttachDownloadUI.this));
          GMTrace.o(2296062672896L, 17107);
          return;
        }
        paramAnonymousView = AppAttachDownloadUI.o(AppAttachDownloadUI.this);
        if ((paramAnonymousView != null) && (paramAnonymousView.field_status != 199L))
        {
          w.i("MicroMsg.AppAttachDownloadUI", "summerapp stopBtn onClick but scene is null and set status[%d] paused", new Object[] { Long.valueOf(paramAnonymousView.field_status) });
          paramAnonymousView.field_status = 102L;
          an.afP().c(paramAnonymousView, new String[0]);
        }
        GMTrace.o(2296062672896L, 17107);
      }
    });
    this.ltK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2241301839872L, 16699);
        AppAttachDownloadUI.k(AppAttachDownloadUI.this).setVisibility(0);
        AppAttachDownloadUI.l(AppAttachDownloadUI.this).setVisibility(8);
        AppAttachDownloadUI.m(AppAttachDownloadUI.this).setVisibility(0);
        if (AppAttachDownloadUI.p(AppAttachDownloadUI.this))
        {
          paramAnonymousView = AppAttachDownloadUI.o(AppAttachDownloadUI.this);
          if (paramAnonymousView != null)
          {
            paramAnonymousView.field_status = 101L;
            paramAnonymousView.field_lastModifyTime = bg.Pu();
            an.afP().c(paramAnonymousView, new String[0]);
          }
          AppAttachDownloadUI.a(AppAttachDownloadUI.this, new ab(AppAttachDownloadUI.q(AppAttachDownloadUI.this), AppAttachDownloadUI.r(AppAttachDownloadUI.this), AppAttachDownloadUI.s(AppAttachDownloadUI.this)));
          at.wS().a(AppAttachDownloadUI.a(AppAttachDownloadUI.this), 0);
        }
        GMTrace.o(2241301839872L, 16699);
      }
    });
    this.lhH.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2364111060992L, 17614);
        AppAttachDownloadUI.t(AppAttachDownloadUI.this);
        AppAttachDownloadUI.u(AppAttachDownloadUI.this);
        GMTrace.o(2364111060992L, 17614);
      }
    });
    Object localObject;
    int i;
    switch (this.lLR)
    {
    case 1: 
    case 3: 
    case 5: 
    default: 
      this.nUc.setImageResource(R.k.cJl);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2380082970624L, 17733);
          if (AppAttachDownloadUI.a(AppAttachDownloadUI.this) != null) {
            at.wS().c(AppAttachDownloadUI.a(AppAttachDownloadUI.this));
          }
          AppAttachDownloadUI.this.finish();
          GMTrace.o(2380082970624L, 17733);
          return true;
        }
      });
      this.eON = getIntent().getBooleanExtra("app_show_share", true);
      if (this.eON) {
        a(0, R.k.cIQ, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(2129901125632L, 15869);
            AppAttachDownloadUI.a(AppAttachDownloadUI.this, AppAttachDownloadUI.b(AppAttachDownloadUI.this));
            GMTrace.o(2129901125632L, 15869);
            return false;
          }
        });
      }
      this.wqM = false;
      localObject = cbD();
      if ((localObject == null) || (!new File(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath).exists())) {
        i = 0;
      }
      break;
    }
    for (;;)
    {
      if (i == 0) {
        break label507;
      }
      w.i("MicroMsg.AppAttachDownloadUI", "summerapp isCanOpenFile");
      this.wqM = true;
      cbE();
      GMTrace.o(2191104409600L, 16325);
      return;
      this.nUc.setImageResource(R.g.aTK);
      break;
      this.nUc.setImageResource(R.k.cJo);
      break;
      this.nUc.setImageResource(q.Oo(this.hLy));
      break;
      if (bg.SM(this.hLy))
      {
        this.nUc.setImageResource(R.g.aTK);
        break;
      }
      this.nUc.setImageResource(R.k.cJl);
      break;
      if ((((com.tencent.mm.pluginsdk.model.app.b)localObject).aDI()) || ((this.eRz.field_isSend == 1) && (((com.tencent.mm.pluginsdk.model.app.b)localObject).field_isUpload))) {
        i = 1;
      } else {
        i = 0;
      }
    }
    label507:
    if ((localObject != null) && (((com.tencent.mm.pluginsdk.model.app.b)localObject).aDI()) && (!new File(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath).exists()))
    {
      w.i("MicroMsg.AppAttachDownloadUI", "summerapp set fail info[%s]", new Object[] { localObject });
      this.wqQ.setVisibility(8);
      this.wqR.setVisibility(0);
      GMTrace.o(2191104409600L, 16325);
      return;
    }
    if (this.wqM)
    {
      GMTrace.o(2191104409600L, 16325);
      return;
    }
    this.kmX = new f()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, k paramAnonymousk)
      {
        GMTrace.i(2234725171200L, 16650);
        if (paramAnonymousInt2 == 0) {}
        for (float f = 0.0F;; f = paramAnonymousInt1 * 100.0F / paramAnonymousInt2)
        {
          if ((paramAnonymousInt1 < paramAnonymousInt2) && (AppAttachDownloadUI.k(AppAttachDownloadUI.this).getVisibility() != 0))
          {
            AppAttachDownloadUI.k(AppAttachDownloadUI.this).setVisibility(0);
            AppAttachDownloadUI.l(AppAttachDownloadUI.this).setVisibility(8);
            AppAttachDownloadUI.m(AppAttachDownloadUI.this).setVisibility(0);
          }
          AppAttachDownloadUI.n(AppAttachDownloadUI.this).setProgress((int)f);
          GMTrace.o(2234725171200L, 16650);
          return;
        }
      }
    };
    switch (this.lLR)
    {
    }
    for (;;)
    {
      w.i("MicroMsg.AppAttachDownloadUI", "summerapp progressCallBack[%s], isDownloadFinished[%b], isDownloadStarted[%b]", new Object[] { this.kmX, Boolean.valueOf(this.wqM), Boolean.valueOf(this.wqN) });
      if ((!this.wqM) && (!this.wqN))
      {
        this.lhL.setVisibility(0);
        this.ltK.setVisibility(8);
        this.wqH.setVisibility(0);
        if (cbC())
        {
          this.toa = new ab(this.eDr, this.mediaId, this.kmX);
          at.wS().a(this.toa, 0);
        }
      }
      GMTrace.o(2191104409600L, 16325);
      return;
      if (this.wqN)
      {
        this.ltK.setVisibility(0);
        label806:
        this.lhL.setVisibility(8);
        this.wqH.setVisibility(8);
        this.lhH.setVisibility(8);
        this.vWa.setVisibility(8);
        this.wqJ.setVisibility(0);
        if (!this.euR.equals("")) {
          break label944;
        }
        this.wqJ.setText(getString(R.l.dNl));
        label877:
        localObject = getMimeType();
        if ((localObject != null) && (!((String)localObject).equals(""))) {
          break label958;
        }
        this.vWa.setText(getString(R.l.dnh));
      }
      while (bg.SM(this.hLy))
      {
        this.vWa.setVisibility(8);
        break;
        this.ltK.setVisibility(8);
        break label806;
        label944:
        this.wqJ.setText(this.euR);
        break label877;
        label958:
        this.vWa.setText(getString(R.l.dni));
      }
      if (this.wqN) {
        this.ltK.setVisibility(0);
      }
      for (;;)
      {
        this.lhL.setVisibility(8);
        this.wqH.setVisibility(8);
        this.lhH.setVisibility(8);
        this.wqJ.setVisibility(8);
        this.vWa.setVisibility(8);
        this.vWa.setText(getString(R.l.dni));
        break;
        this.ltK.setVisibility(8);
      }
      this.lhL.setVisibility(0);
      this.wqH.setVisibility(0);
      this.ltK.setVisibility(8);
      this.lhH.setVisibility(8);
      this.wqJ.setVisibility(8);
      this.vWa.setVisibility(8);
      if (cbC())
      {
        this.toa = new ab(this.eDr, this.mediaId, this.kmX);
        at.wS().a(this.toa, 0);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2192312369152L, 16334);
    w.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd type[%d], [%d, %d, %s]", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramk.getType() != 221) && (paramk.getType() != 728))
    {
      GMTrace.o(2192312369152L, 16334);
      return;
    }
    if ((paramk.getType() == 728) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = cbD();
      if (paramString == null)
      {
        w.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd getAppAttachInfo is null");
        this.toa = new ab(this.eDr, this.mediaId, this.kmX);
        at.wS().a(this.toa, 0);
        GMTrace.o(2192312369152L, 16334);
        return;
      }
      if (paramString.field_signature == null) {}
      for (paramInt1 = -1;; paramInt1 = paramString.field_signature.length())
      {
        w.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", new Object[] { Integer.valueOf(paramInt1) });
        break;
      }
    }
    if ((this.toa == null) && ((paramk instanceof ab)))
    {
      paramString = (ab)paramk;
      com.tencent.mm.pluginsdk.model.app.b localb = cbD();
      if ((localb != null) && (!t.nm(localb.field_mediaSvrId)) && (localb.field_mediaSvrId.equals(paramString.getMediaId())))
      {
        this.toa = paramString;
        w.i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd reset downloadAppAttachScene[%s] by mediaSvrId[%s]", new Object[] { this.toa, localb.field_mediaSvrId });
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = com.tencent.mm.plugin.report.service.g.ork;
      paramk = this.wqL.giC;
      if (this.wqL.giz == 1) {}
      for (paramInt1 = 7;; paramInt1 = 5)
      {
        paramString.i(14665, new Object[] { paramk, Integer.valueOf(paramInt1), Integer.valueOf(this.wqL.giv), Integer.valueOf(0), Integer.valueOf(0), this.hLy });
        GMTrace.o(2192312369152L, 16334);
        return;
      }
    }
    if ((paramInt2 != 0) && (com.tencent.mm.sdk.a.b.bPq())) {
      Toast.makeText(this, "errCode[" + paramInt2 + "]", 0).show();
    }
    if (paramInt2 == -5103059)
    {
      this.wqR.setVisibility(0);
      this.wqQ.setVisibility(8);
      if (this.lLR == 6)
      {
        paramString = com.tencent.mm.plugin.report.service.g.ork;
        paramk = this.wqL.giC;
        if (this.wqL.giz != 1) {
          break label576;
        }
      }
      label576:
      for (paramInt1 = 7;; paramInt1 = 5)
      {
        paramString.i(14665, new Object[] { paramk, Integer.valueOf(paramInt1), Integer.valueOf(this.wqL.giv), Integer.valueOf(1), Integer.valueOf(0), this.hLy });
        GMTrace.o(2192312369152L, 16334);
        return;
      }
    }
    this.lhL.setVisibility(8);
    this.ltK.setVisibility(0);
    this.wqH.setVisibility(8);
    w.e("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd, download fail, type = " + paramk.getType() + " errType = " + paramInt1 + ", errCode = " + paramInt2);
    GMTrace.o(2192312369152L, 16334);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(2191775498240L, 16330);
    paramString = cbD();
    long l1;
    long l2;
    if (paramString != null)
    {
      l1 = paramString.field_totalLen;
      l2 = paramString.field_offset;
      this.wqI.setText(getString(R.l.dnj, new Object[] { t.aF(l2), t.aF(l1) }));
      if (paramString.field_totalLen != 0L) {
        break label331;
      }
    }
    label331:
    for (int i = 0;; i = (int)(paramString.field_offset * 100L / paramString.field_totalLen))
    {
      w.v("MicroMsg.AppAttachDownloadUI", "summerapp attach progress:" + i + " offset:" + l2 + " totallen:" + l1);
      this.jeL.setProgress(i);
      if ((paramString.field_status == 199L) && (i >= 100) && (!this.wqM))
      {
        this.wqM = true;
        if (paramString != null)
        {
          Toast.makeText(this, getString(R.l.dns) + " : " + paramString.field_fileFullPath.replaceFirst(com.tencent.mm.compatible.util.e.ghx, com.tencent.mm.compatible.util.e.fRW), this.wqP).show();
          com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramString.field_fileFullPath, this.hLy, 1);
        }
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14954136600576L, 111417);
            AppAttachDownloadUI.v(AppAttachDownloadUI.this);
            GMTrace.o(14954136600576L, 111417);
          }
        }, 200L);
      }
      if ((this.lhL.getVisibility() != 0) && (i < 100) && (!paramString.field_isUpload) && (paramString.field_status == 101L))
      {
        w.i("MicroMsg.AppAttachDownloadUI", "summerapp still downloading updateProgress progress[%d]", new Object[] { Integer.valueOf(i) });
        this.lhL.setVisibility(0);
        this.ltK.setVisibility(8);
        this.wqH.setVisibility(0);
      }
      GMTrace.o(2191775498240L, 16330);
      return;
    }
  }
  
  public final void bJE()
  {
    GMTrace.i(2192446586880L, 16335);
    Toast.makeText(this, R.l.dnq, 0).show();
    GMTrace.o(2192446586880L, 16335);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2192178151424L, 16333);
    int i = R.i.cuu;
    GMTrace.o(2192178151424L, 16333);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2191641280512L, 16329);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, this.wqO, R.l.dnn, R.l.dno, 1);
    GMTrace.o(2191641280512L, 16329);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2190433320960L, 16320);
    super.onCreate(paramBundle);
    init();
    GMTrace.o(2190433320960L, 16320);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2190701756416L, 16322);
    an.afP().j(this);
    super.onDestroy();
    GMTrace.o(2190701756416L, 16322);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(2192580804608L, 16336);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    init();
    GMTrace.o(2192580804608L, 16336);
  }
  
  protected void onPause()
  {
    GMTrace.i(2190970191872L, 16324);
    at.wS().b(221, this);
    at.wS().b(728, this);
    super.onPause();
    li localli = new li();
    localli.ePD.ePE = false;
    com.tencent.mm.sdk.b.a.vgX.a(localli, getMainLooper());
    w.d("MicroMsg.AppAttachDownloadUI", "AppAttachDownloadUI cancel pause auto download logic");
    GMTrace.o(2190970191872L, 16324);
  }
  
  protected void onResume()
  {
    GMTrace.i(2190835974144L, 16323);
    super.onResume();
    at.wS().a(221, this);
    at.wS().a(728, this);
    li localli = new li();
    localli.ePD.ePE = true;
    com.tencent.mm.sdk.b.a.vgX.a(localli, getMainLooper());
    w.d("MicroMsg.AppAttachDownloadUI", "AppAttachDownloadUI req pause auto download logic");
    this.lhH.setEnabled(true);
    GMTrace.o(2190835974144L, 16323);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\AppAttachDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */