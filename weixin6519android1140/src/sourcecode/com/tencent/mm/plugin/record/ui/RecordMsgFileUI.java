package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Base64;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.i.a;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.plugin.record.a.s;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.tools.a;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RecordMsgFileUI
  extends MMActivity
  implements i.a
{
  private long eDr;
  private th eIc;
  private ae ghS;
  private TextView iuc;
  private com.tencent.mm.pluginsdk.ui.tools.f jGP;
  private TextView jUm;
  private ProgressBar jeL;
  private Button lhG;
  private Button lhH;
  private Button lhI;
  private MMImageView lhJ;
  private TextView lhK;
  private View lhL;
  private View lhM;
  private boolean lhQ;
  private boolean lhU;
  private boolean lhV;
  private String mediaId;
  private j oik;
  
  public RecordMsgFileUI()
  {
    GMTrace.i(7536056991744L, 56148);
    this.jGP = null;
    this.lhQ = false;
    this.lhV = false;
    this.lhU = false;
    GMTrace.o(7536056991744L, 56148);
  }
  
  private void azb()
  {
    GMTrace.i(7536728080384L, 56153);
    this.lhI.setVisibility(8);
    this.lhG.setVisibility(8);
    this.lhH.setVisibility(8);
    this.lhL.setVisibility(8);
    this.iuc.setVisibility(0);
    if (this.eIc.aGU == 4)
    {
      this.iuc.setGravity(17);
      this.iuc.setText(R.l.duk);
      GMTrace.o(7536728080384L, 56153);
      return;
    }
    this.iuc.setGravity(17);
    this.iuc.setText(R.l.duj);
    GMTrace.o(7536728080384L, 56153);
  }
  
  private void azc()
  {
    GMTrace.i(7536862298112L, 56154);
    this.lhI.setVisibility(8);
    this.lhG.setVisibility(8);
    this.lhH.setVisibility(8);
    this.iuc.setVisibility(8);
    this.lhL.setVisibility(0);
    b(s.baL().Fv(this.mediaId));
    GMTrace.o(7536862298112L, 56154);
  }
  
  private void azd()
  {
    GMTrace.i(7536996515840L, 56155);
    this.lhL.setVisibility(8);
    this.lhH.setVisibility(8);
    if (bg.nm(this.eIc.ujA)) {
      this.lhG.setVisibility(8);
    }
    for (;;)
    {
      this.lhI.setVisibility(0);
      this.lhI.setText(R.l.dtT);
      this.iuc.setVisibility(8);
      GMTrace.o(7536996515840L, 56155);
      return;
      this.lhG.setVisibility(0);
    }
  }
  
  private void aze()
  {
    GMTrace.i(7538204475392L, 56164);
    if (this.lhU)
    {
      GMTrace.o(7538204475392L, 56164);
      return;
    }
    this.lhU = true;
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_fav_path", m.c(this.eIc, this.eDr));
    localIntent.putExtra("key_detail_fav_thumb_path", m.f(this.eIc, this.eDr));
    localIntent.putExtra("key_detail_fav_video_duration", this.eIc.duration);
    localIntent.putExtra("key_detail_statExtStr", this.eIc.eTv);
    localIntent.putExtra("key_detail_fav_video_scene_from", 1);
    com.tencent.mm.bj.d.b(this, "favorite", ".ui.detail.FavoriteVideoPlayUI", localIntent);
    finish();
    GMTrace.o(7538204475392L, 56164);
  }
  
  private void b(com.tencent.mm.plugin.record.a.g paramg)
  {
    final int i = 0;
    GMTrace.i(7537936039936L, 56162);
    final int j;
    final int k;
    if (paramg != null)
    {
      j = (int)(paramg.field_offset / Math.max(1, paramg.field_totalLen) * 100.0F);
      i = paramg.field_offset;
      k = paramg.field_totalLen;
    }
    for (;;)
    {
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7558471352320L, 56315);
          RecordMsgFileUI.n(RecordMsgFileUI.this).setProgress(j);
          RecordMsgFileUI.o(RecordMsgFileUI.this).setText(RecordMsgFileUI.this.getString(R.l.dth, new Object[] { bg.ab(i), bg.ab(k) }));
          GMTrace.o(7558471352320L, 56315);
        }
      });
      GMTrace.o(7537936039936L, 56162);
      return;
      k = (int)this.eIc.ujO;
      j = 0;
    }
  }
  
  private void baZ()
  {
    GMTrace.i(7537130733568L, 56156);
    if ((getType() == 15) && (this.eIc.ukt != null) && (!bg.nm(this.eIc.ukt.gkI)) && (!bg.nm(this.eIc.ukt.gkM)))
    {
      this.lhV = true;
      this.lhJ.setVisibility(8);
      this.lhL.setVisibility(8);
      this.lhI.setVisibility(8);
      this.lhG.setVisibility(8);
      this.lhH.setVisibility(8);
      this.iuc.setVisibility(8);
      String str = m.c(this.eIc, this.eDr);
      w.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.tB() + " initView: fullpath:" + str);
      ViewGroup localViewGroup = (ViewGroup)findViewById(R.h.ckd);
      this.jGP = com.tencent.mm.pluginsdk.ui.tools.n.dX(this.vKB.vKW);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(13);
      localViewGroup.addView((View)this.jGP, 0, localLayoutParams);
      this.jGP.a(new f.a()
      {
        public final void Xq()
        {
          GMTrace.i(7561692577792L, 56339);
          w.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.tB() + " onPrepared");
          RecordMsgFileUI.i(RecordMsgFileUI.this).ci(true);
          RecordMsgFileUI.i(RecordMsgFileUI.this).start();
          GMTrace.o(7561692577792L, 56339);
        }
        
        public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(7562095230976L, 56342);
          GMTrace.o(7562095230976L, 56342);
          return 0;
        }
        
        public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(7562229448704L, 56343);
          GMTrace.o(7562229448704L, 56343);
        }
        
        public final void onCompletion()
        {
          GMTrace.i(7561961013248L, 56341);
          GMTrace.o(7561961013248L, 56341);
        }
        
        public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(7561826795520L, 56340);
          RecordMsgFileUI.i(RecordMsgFileUI.this).stop();
          if (RecordMsgFileUI.j(RecordMsgFileUI.this))
          {
            GMTrace.o(7561826795520L, 56340);
            return;
          }
          RecordMsgFileUI.k(RecordMsgFileUI.this);
          final Bitmap localBitmap = RecordMsgFileUI.l(RecordMsgFileUI.this).b(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
          final String str = RecordMsgFileUI.i(RecordMsgFileUI.this).NE();
          b.r(Base64.encodeToString((com.tencent.mm.plugin.sight.base.d.bgi() + "[RecordMsgFileUI] on play sight error, what=" + paramAnonymousInt1 + ", extra=" + paramAnonymousInt2 + ", path=" + bg.aq(str, "")).getBytes(), 2), "FullScreenPlaySight");
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7534446379008L, 56136);
              Object localObject = (ImageView)RecordMsgFileUI.this.findViewById(R.h.ckO);
              ((ImageView)localObject).setImageBitmap(localBitmap);
              ((ImageView)localObject).setVisibility(0);
              localObject = new Intent();
              ((Intent)localObject).setAction("android.intent.action.VIEW");
              ((Intent)localObject).setDataAndType(Uri.fromFile(new File(str)), "video/*");
              try
              {
                RecordMsgFileUI.this.startActivity(Intent.createChooser((Intent)localObject, RecordMsgFileUI.this.getString(R.l.dve)));
                GMTrace.o(7534446379008L, 56136);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.RecordMsgFileUI", "startActivity fail, activity not found");
                h.h(RecordMsgFileUI.this.vKB.vKW, R.l.due, R.l.duf);
                GMTrace.o(7534446379008L, 56136);
              }
            }
          });
          GMTrace.o(7561826795520L, 56340);
        }
      });
      w.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.tB() + " initView :" + str);
      if (str != null)
      {
        this.jGP.stop();
        this.jGP.setVideoPath(str);
      }
      w.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.tB() + " initView");
      if (at.pD() != null) {
        at.pD().ri();
      }
    }
    if ((getType() == 15) || (getType() == 4))
    {
      if (!this.lhV)
      {
        this.lhL.setVisibility(8);
        this.lhI.setVisibility(8);
        this.lhG.setVisibility(8);
        this.lhH.setVisibility(0);
        this.lhH.setText(R.l.dtU);
        this.iuc.setVisibility(8);
        aze();
        GMTrace.o(7537130733568L, 56156);
      }
    }
    else
    {
      this.lhL.setVisibility(8);
      this.lhI.setVisibility(4);
      if (!bg.nm(this.eIc.ujA)) {
        break label489;
      }
      this.lhG.setVisibility(8);
    }
    for (;;)
    {
      this.lhH.setVisibility(0);
      this.iuc.setVisibility(0);
      GMTrace.o(7537130733568L, 56156);
      return;
      label489:
      this.lhG.setVisibility(0);
    }
  }
  
  private String bba()
  {
    GMTrace.i(7537801822208L, 56161);
    Object localObject = new File(m.f(this.eIc, this.eDr));
    if (((File)localObject).exists()) {}
    for (localObject = ((File)localObject).getAbsolutePath();; localObject = com.tencent.mm.y.c.zi() + "web/" + com.tencent.mm.a.g.n(bg.aq(this.eIc.eDk, "").getBytes()))
    {
      GMTrace.o(7537801822208L, 56161);
      return (String)localObject;
      localObject = new StringBuilder();
      at.AR();
    }
  }
  
  private int getType()
  {
    GMTrace.i(7536593862656L, 56152);
    int i = this.eIc.aGU;
    if (i == 15)
    {
      GMTrace.o(7536593862656L, 56152);
      return 4;
    }
    GMTrace.o(7536593862656L, 56152);
    return i;
  }
  
  protected final int Qf()
  {
    GMTrace.i(7536325427200L, 56150);
    GMTrace.o(7536325427200L, 56150);
    return 1;
  }
  
  public final void a(int paramInt, com.tencent.mm.plugin.record.a.g paramg)
  {
    GMTrace.i(7538070257664L, 56163);
    if (paramg == null)
    {
      w.w("MicroMsg.RecordMsgFileUI", "on cdn info changed, but cdn info is null");
      GMTrace.o(7538070257664L, 56163);
      return;
    }
    w.v("MicroMsg.RecordMsgFileUI", "cur mediaid[%s], notify mediaid[%s]", new Object[] { this.mediaId, paramg.field_mediaId });
    if (!this.mediaId.equals(paramg.field_mediaId))
    {
      GMTrace.o(7538070257664L, 56163);
      return;
    }
    switch (paramg.field_status)
    {
    default: 
      b(paramg);
      GMTrace.o(7538070257664L, 56163);
      return;
    case 2: 
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7559679311872L, 56324);
          RecordMsgFileUI.this.lf(true);
          RecordMsgFileUI.p(RecordMsgFileUI.this);
          GMTrace.o(7559679311872L, 56324);
        }
      });
      GMTrace.o(7538070257664L, 56163);
      return;
    case 4: 
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7551626248192L, 56264);
          RecordMsgFileUI.q(RecordMsgFileUI.this);
          GMTrace.o(7551626248192L, 56264);
        }
      });
      GMTrace.o(7538070257664L, 56163);
      return;
    }
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7542633660416L, 56197);
        RecordMsgFileUI.g(RecordMsgFileUI.this);
        h.bm(RecordMsgFileUI.this.vKB.vKW, RecordMsgFileUI.this.getString(R.l.dnk));
        GMTrace.o(7542633660416L, 56197);
      }
    });
    GMTrace.o(7538070257664L, 56163);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7536191209472L, 56149);
    int i = R.i.cwX;
    GMTrace.o(7536191209472L, 56149);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(7537667604480L, 56160);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.dnn, R.l.dno, 5);
    if (paramInt2 != -1)
    {
      GMTrace.o(7537667604480L, 56160);
      return;
    }
    if (paramInt1 == 1001)
    {
      if (paramIntent == null)
      {
        localObject1 = null;
        if (paramIntent != null) {
          break label152;
        }
      }
      final Object localObject2;
      label152:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        localObject2 = h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
        w.d("MicroMsg.RecordMsgFileUI", "do share msg, fav msg type %d", new Object[] { Integer.valueOf(getType()) });
        localObject2 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7520219299840L, 56030);
            localObject2.dismiss();
            GMTrace.o(7520219299840L, 56030);
          }
        };
        if (!bg.nm((String)localObject1)) {
          break label163;
        }
        GMTrace.o(7537667604480L, 56160);
        return;
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label163:
      final Object localObject1 = bg.g(((String)localObject1).split(","));
      if ((getType() == 4) || (getType() == 15))
      {
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7557129175040L, 56305);
            File localFile = new File(m.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this)));
            Iterator localIterator = localObject1.iterator();
            if (localIterator.hasNext())
            {
              String str1 = (String)localIterator.next();
              Object localObject1;
              if (localFile.exists())
              {
                localObject1 = RecordMsgFileUI.m(RecordMsgFileUI.this);
                w.d("MicroMsg.RecordMsgFileUI", "sendVideo::data path[%s] thumb path[%s]", new Object[] { localFile.getAbsolutePath(), localObject1 });
                if (RecordMsgFileUI.c(RecordMsgFileUI.this) == 15) {
                  com.tencent.mm.plugin.messenger.a.d.aOe().a(RecordMsgFileUI.this.vKB.vKW, str1, localFile.getAbsolutePath(), (String)localObject1, 62, RecordMsgFileUI.a(RecordMsgFileUI.this).duration, "");
                }
              }
              for (;;)
              {
                com.tencent.mm.plugin.messenger.a.d.aOe().cR(paramIntent, str1);
                break;
                com.tencent.mm.plugin.messenger.a.d.aOe().a(RecordMsgFileUI.this.vKB.vKW, str1, localFile.getAbsolutePath(), (String)localObject1, 1, RecordMsgFileUI.a(RecordMsgFileUI.this).duration, "");
                continue;
                Object localObject2 = RecordMsgFileUI.a(RecordMsgFileUI.this).ujA;
                if (!bg.nm((String)localObject2))
                {
                  localObject1 = new WXVideoObject();
                  ((WXVideoObject)localObject1).videoUrl = ((String)localObject2);
                  localObject2 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject1);
                  String str2 = bg.aq(RecordMsgFileUI.a(RecordMsgFileUI.this).title, RecordMsgFileUI.this.vKB.vKW.getResources().getString(R.l.dve));
                  ((WXMediaMessage)localObject2).mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
                  ((WXMediaMessage)localObject2).title = str2;
                  ((WXMediaMessage)localObject2).description = RecordMsgFileUI.a(RecordMsgFileUI.this).desc;
                  ((WXMediaMessage)localObject2).thumbData = bg.readFromFile(m.f(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this)));
                  if (((WXMediaMessage)localObject2).thumbData == null)
                  {
                    localObject1 = new StringBuilder();
                    at.AR();
                    ((WXMediaMessage)localObject2).thumbData = bg.readFromFile(com.tencent.mm.y.c.zi() + "web/" + com.tencent.mm.a.g.n(bg.aq(RecordMsgFileUI.a(RecordMsgFileUI.this).eDk, "").getBytes()));
                  }
                  l.a((WXMediaMessage)localObject2, "", "", str1, 3, null);
                }
              }
            }
            af.t(localObject2);
            GMTrace.o(7557129175040L, 56305);
          }
          
          public final String toString()
          {
            GMTrace.i(7557263392768L, 56306);
            String str = super.toString() + "|onActivityResult1";
            GMTrace.o(7557263392768L, 56306);
            return str;
          }
        });
        GMTrace.o(7537667604480L, 56160);
        return;
      }
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7542902095872L, 56199);
          Object localObject1 = m.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
          Object localObject2 = new WXFileObject();
          ((WXFileObject)localObject2).setFilePath((String)localObject1);
          localObject1 = new WXMediaMessage();
          ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
          ((WXMediaMessage)localObject1).title = RecordMsgFileUI.a(RecordMsgFileUI.this).title;
          ((WXMediaMessage)localObject1).description = RecordMsgFileUI.a(RecordMsgFileUI.this).desc;
          ((WXMediaMessage)localObject1).thumbData = bg.readFromFile(m.f(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this)));
          localObject2 = localObject1.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str = (String)((Iterator)localObject2).next();
            l.a((WXMediaMessage)localObject1, "", "", str, 3, null);
            com.tencent.mm.plugin.messenger.a.d.aOe().cR(paramIntent, str);
          }
          af.t(localObject2);
          GMTrace.o(7542902095872L, 56199);
        }
        
        public final String toString()
        {
          GMTrace.i(7543036313600L, 56200);
          String str = super.toString() + "|onActivityResult2";
          GMTrace.o(7543036313600L, 56200);
          return str;
        }
      });
    }
    GMTrace.o(7537667604480L, 56160);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(7536459644928L, 56151);
    super.onCreate(paramBundle);
    this.ghS = new ae();
    this.oik = new j();
    this.eDr = getIntent().getLongExtra("message_id", -1L);
    paramBundle = getIntent().getStringExtra("record_data_id");
    Object localObject = m.Fw(getIntent().getStringExtra("record_xml"));
    if (localObject == null)
    {
      w.w("MicroMsg.RecordMsgFileUI", "get record msg data error, empty");
      finish();
      GMTrace.o(7536459644928L, 56151);
      return;
    }
    localObject = ((com.tencent.mm.protocal.b.a.c)localObject).glr.iterator();
    while (((Iterator)localObject).hasNext())
    {
      th localth = (th)((Iterator)localObject).next();
      if (localth.lhq.equals(paramBundle)) {
        this.eIc = localth;
      }
    }
    if (this.eIc == null)
    {
      w.w("MicroMsg.RecordMsgFileUI", "get data error, empty");
      finish();
      GMTrace.o(7536459644928L, 56151);
      return;
    }
    this.mediaId = m.d(this.eIc.lhq, this.eDr, true);
    this.lhG = ((Button)findViewById(R.h.bTM));
    this.lhH = ((Button)findViewById(R.h.bSs));
    this.lhI = ((Button)findViewById(R.h.buO));
    this.lhJ = ((MMImageView)findViewById(R.h.bGr));
    this.jUm = ((TextView)findViewById(R.h.bPp));
    this.iuc = ((TextView)findViewById(R.h.chF));
    this.lhM = findViewById(R.h.bvg);
    this.lhL = findViewById(R.h.bvc);
    this.jeL = ((ProgressBar)findViewById(R.h.bvb));
    this.lhK = ((TextView)findViewById(R.h.bvd));
    if (4 == getType())
    {
      oM(R.l.dve);
      if (getType() != 4) {
        break label592;
      }
      this.lhJ.setImageResource(R.k.cJo);
      label367:
      this.jUm.setText(this.eIc.title);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7530688282624L, 56108);
          RecordMsgFileUI.this.finish();
          GMTrace.o(7530688282624L, 56108);
          return true;
        }
      });
      this.lhH.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7523172089856L, 56052);
          paramAnonymousView = m.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
          new Intent().setAction("android.intent.action.VIEW");
          if (4 == RecordMsgFileUI.c(RecordMsgFileUI.this))
          {
            RecordMsgFileUI.d(RecordMsgFileUI.this);
            RecordMsgFileUI.e(RecordMsgFileUI.this);
            GMTrace.o(7523172089856L, 56052);
            return;
          }
          RecordMsgFileUI.a(RecordMsgFileUI.this, paramAnonymousView);
          GMTrace.o(7523172089856L, 56052);
        }
      });
      paramBundle = this.eIc.ujA;
      if (!bg.nm(paramBundle)) {
        this.lhG.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7526795968512L, 56079);
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", paramBundle);
            com.tencent.mm.bj.d.b(RecordMsgFileUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
            GMTrace.o(7526795968512L, 56079);
          }
        });
      }
      this.lhI.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7522232565760L, 56045);
          if (!com.tencent.mm.compatible.util.f.ty())
          {
            h.h(RecordMsgFileUI.this.vKB.vKW, R.l.dug, R.l.cUG);
            GMTrace.o(7522232565760L, 56045);
            return;
          }
          m.a(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this), true);
          RecordMsgFileUI.f(RecordMsgFileUI.this);
          GMTrace.o(7522232565760L, 56045);
        }
      });
      this.lhM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7559947747328L, 56326);
          RecordMsgFileUI.g(RecordMsgFileUI.this);
          GMTrace.o(7559947747328L, 56326);
        }
      });
      if ((getType() != 15) || (bg.Sy(com.tencent.mm.k.g.ut().getValue("SightForwardEnable")) == 1)) {
        break label612;
      }
      w.w("MicroMsg.RecordMsgFileUI", "can not retransmit sight msg");
      label503:
      if ((!bg.nm(this.eIc.ujt)) && (!bg.nm(this.eIc.ujv))) {
        break label631;
      }
      azb();
    }
    for (;;)
    {
      s.baL().a(this);
      GMTrace.o(7536459644928L, 56151);
      return;
      if (15 == getType())
      {
        oM(R.l.duM);
        findViewById(R.h.ckd).setBackgroundResource(R.e.black);
        break;
      }
      oM(R.l.dtK);
      break;
      label592:
      this.lhJ.setImageResource(com.tencent.mm.pluginsdk.c.NV(this.eIc.ujI));
      break label367;
      label612:
      a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7558202916864L, 56313);
          paramAnonymousMenuItem = new com.tencent.mm.ui.widget.f(RecordMsgFileUI.this.vKB.vKW, com.tencent.mm.ui.widget.f.xpQ, false);
          paramAnonymousMenuItem.qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(7527332839424L, 56083);
              paramAnonymous2n.e(0, RecordMsgFileUI.this.getString(R.l.duL));
              GMTrace.o(7527332839424L, 56083);
            }
          };
          paramAnonymousMenuItem.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(7525453791232L, 56069);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(7525453791232L, 56069);
                return;
                if (RecordMsgFileUI.c(RecordMsgFileUI.this) == 8)
                {
                  paramAnonymous2MenuItem = m.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
                  if (!com.tencent.mm.a.e.aZ(paramAnonymous2MenuItem))
                  {
                    w.e("MicroMsg.RecordMsgFileUI", "share file failed, file not exists");
                    Toast.makeText(RecordMsgFileUI.this, RecordMsgFileUI.this.getString(R.l.duJ), 1).show();
                    GMTrace.o(7525453791232L, 56069);
                    return;
                  }
                  if (new File(paramAnonymous2MenuItem).length() > 10485760L)
                  {
                    w.e("MicroMsg.RecordMsgFileUI", "share file failed, file too large");
                    Toast.makeText(RecordMsgFileUI.this, RecordMsgFileUI.this.getString(R.l.duK), 1).show();
                    GMTrace.o(7525453791232L, 56069);
                    return;
                  }
                }
                RecordMsgFileUI.h(RecordMsgFileUI.this);
              }
            }
          };
          paramAnonymousMenuItem.bFk();
          GMTrace.o(7558202916864L, 56313);
          return true;
        }
      });
      break label503;
      label631:
      if (!m.d(this.eIc, this.eDr)) {
        break label657;
      }
      lf(true);
      baZ();
    }
    label657:
    paramBundle = s.baL().Fv(this.mediaId);
    if ((paramBundle == null) || (2 == paramBundle.field_status)) {
      azd();
    }
    for (;;)
    {
      lf(false);
      break;
      if (4 == paramBundle.field_status)
      {
        azb();
      }
      else if ((paramBundle.field_status == 0) || (1 == paramBundle.field_status))
      {
        azc();
      }
      else
      {
        w.w("MicroMsg.RecordMsgFileUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        azd();
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7537264951296L, 56157);
    if (this.jGP != null)
    {
      this.jGP.a(null);
      this.jGP.stop();
      this.jGP.onDetach();
      if (at.pD() != null) {
        at.pD().rh();
      }
    }
    super.onDestroy();
    s.baL().b(this);
    this.oik.destory();
    GMTrace.o(7537264951296L, 56157);
  }
  
  protected void onPause()
  {
    GMTrace.i(7537533386752L, 56159);
    super.onPause();
    if (this.jGP != null) {
      this.jGP.stop();
    }
    GMTrace.o(7537533386752L, 56159);
  }
  
  protected void onResume()
  {
    GMTrace.i(7537399169024L, 56158);
    super.onResume();
    if (this.jGP != null) {
      this.jGP.start();
    }
    GMTrace.o(7537399169024L, 56158);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\RecordMsgFileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */