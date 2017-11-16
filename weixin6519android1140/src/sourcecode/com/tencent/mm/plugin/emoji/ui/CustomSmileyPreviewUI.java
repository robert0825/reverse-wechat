package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.plugin.emoji.model.g.a;
import com.tencent.mm.plugin.emoji.model.g.b;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI;
import com.tencent.mm.pluginsdk.ui.chat.l.b;
import com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.protocal.c.qv;
import com.tencent.mm.protocal.c.rd;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.protocal.c.zo;
import com.tencent.mm.protocal.c.zu;
import com.tencent.mm.protocal.c.zy;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomSmileyPreviewUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, e, g.a, g.b
{
  private ListView Ev;
  private final String TAG;
  private String eEa;
  private EmojiInfo iZN;
  private com.tencent.mm.sdk.b.c knA;
  private com.tencent.mm.plugin.emoji.f.g knB;
  com.tencent.mm.plugin.emoji.a.f knI;
  private View knJ;
  private ImageView knK;
  private TextView knL;
  private TextView knM;
  private zo knN;
  private rd knO;
  private String knP;
  private TextView knQ;
  private com.tencent.mm.plugin.emoji.model.g knR;
  private zu knS;
  private final int knT;
  private long knU;
  String knV;
  private String knW;
  private com.tencent.mm.sdk.b.c knX;
  protected final int knp;
  private final int knq;
  private final int knr;
  private final String kns;
  private final String knt;
  private final String knu;
  ae mHandler;
  
  public CustomSmileyPreviewUI()
  {
    GMTrace.i(11379650068480L, 84785);
    this.TAG = "MicroMsg.emoji.CustomSmileyPreviewUI";
    this.knO = new rd();
    this.knp = 131074;
    this.knq = 131075;
    this.knr = 131076;
    this.knT = 131077;
    this.kns = "product_id";
    this.knt = "progress";
    this.knu = "status";
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11401930211328L, 84951);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11401930211328L, 84951);
          return;
          if (CustomSmileyPreviewUI.a(CustomSmileyPreviewUI.this) != null)
          {
            CustomSmileyPreviewUI.a(CustomSmileyPreviewUI.this).setText(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(CustomSmileyPreviewUI.b(CustomSmileyPreviewUI.this).GS()));
            GMTrace.o(11401930211328L, 84951);
            return;
            CustomSmileyPreviewUI.a(CustomSmileyPreviewUI.this, CustomSmileyPreviewUI.c(CustomSmileyPreviewUI.this), CustomSmileyPreviewUI.b(CustomSmileyPreviewUI.this));
            GMTrace.o(11401930211328L, 84951);
            return;
            int i = paramAnonymousMessage.getData().getInt("progress");
            paramAnonymousMessage = paramAnonymousMessage.getData().getString("product_id");
            if (bg.nm(paramAnonymousMessage))
            {
              w.w("MicroMsg.emoji.CustomSmileyPreviewUI", "product id is null.");
              GMTrace.o(11401930211328L, 84951);
              return;
            }
            if ((CustomSmileyPreviewUI.d(CustomSmileyPreviewUI.this) != null) && (CustomSmileyPreviewUI.d(CustomSmileyPreviewUI.this).kho != null))
            {
              CustomSmileyPreviewUI.d(CustomSmileyPreviewUI.this).aO(paramAnonymousMessage, i);
              CustomSmileyPreviewUI.d(CustomSmileyPreviewUI.this).anc();
              GMTrace.o(11401930211328L, 84951);
              return;
              i = paramAnonymousMessage.getData().getInt("status");
              paramAnonymousMessage = paramAnonymousMessage.getData().getString("product_id");
              if (bg.nm(paramAnonymousMessage))
              {
                w.w("MicroMsg.emoji.CustomSmileyPreviewUI", "product id is null.");
                GMTrace.o(11401930211328L, 84951);
                return;
              }
              if ((CustomSmileyPreviewUI.d(CustomSmileyPreviewUI.this) != null) && (CustomSmileyPreviewUI.d(CustomSmileyPreviewUI.this).kho != null)) {
                CustomSmileyPreviewUI.d(CustomSmileyPreviewUI.this).aN(paramAnonymousMessage, i);
              }
            }
          }
        }
      }
    };
    this.knA = new com.tencent.mm.sdk.b.c() {};
    this.knX = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(11379650068480L, 84785);
  }
  
  private static void a(CustomSmileyPreviewUI paramCustomSmileyPreviewUI, TextView paramTextView, Bitmap paramBitmap)
  {
    GMTrace.i(11380858028032L, 84794);
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)paramCustomSmileyPreviewUI.getResources().getDimension(R.f.aQo);
    paramBitmap.setBounds(0, 0, i, i);
    paramTextView.setCompoundDrawables(paramBitmap, null, null, null);
    GMTrace.o(11380858028032L, 84794);
  }
  
  private void a(String paramString, EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11381260681216L, 84797);
    if ((bg.nm(paramString)) || (paramEmojiInfo == null))
    {
      GMTrace.o(11381260681216L, 84797);
      return;
    }
    if ((!bg.nm(paramString)) && (paramEmojiInfo.field_catalog != EmojiGroupInfo.vCm) && (paramEmojiInfo.field_catalog != EmojiGroupInfo.vCl) && ((paramEmojiInfo.field_type != EmojiInfo.vCy) || (paramEmojiInfo.field_type != EmojiInfo.vCz)) && (com.tencent.mm.plugin.emoji.model.h.arl().kjA.UH(paramString)))
    {
      if (this.Ev != null) {
        this.Ev.setVisibility(0);
      }
      if (this.knI != null)
      {
        if (com.tencent.mm.plugin.emoji.model.h.arl().kjA.UI(paramString))
        {
          this.knI.kgJ = true;
          GMTrace.o(11381260681216L, 84797);
          return;
        }
        this.knI.kgJ = false;
        GMTrace.o(11381260681216L, 84797);
      }
    }
    else if (this.Ev != null)
    {
      this.Ev.setVisibility(8);
    }
    GMTrace.o(11381260681216L, 84797);
  }
  
  private void asj()
  {
    GMTrace.i(17970680037376L, 133892);
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19267760160768L, 143556);
        if ((CustomSmileyPreviewUI.h(CustomSmileyPreviewUI.this) != null) && (CustomSmileyPreviewUI.h(CustomSmileyPreviewUI.this).uqz != null))
        {
          CustomSmileyPreviewUI.i(CustomSmileyPreviewUI.this).setVisibility(0);
          CustomSmileyPreviewUI.j(CustomSmileyPreviewUI.this).setText(CustomSmileyPreviewUI.h(CustomSmileyPreviewUI.this).uqz.lPi);
          if (bg.nm(CustomSmileyPreviewUI.h(CustomSmileyPreviewUI.this).uqz.lRV)) {
            CustomSmileyPreviewUI.k(CustomSmileyPreviewUI.this).setVisibility(8);
          }
          for (;;)
          {
            CustomSmileyPreviewUI.l(CustomSmileyPreviewUI.this).setText(R.l.dnF);
            CustomSmileyPreviewUI.i(CustomSmileyPreviewUI.this).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymous2View)
              {
                GMTrace.i(19267357507584L, 143553);
                CustomSmileyPreviewUI.a(CustomSmileyPreviewUI.this, CustomSmileyPreviewUI.h(CustomSmileyPreviewUI.this).uqz.ugQ);
                GMTrace.o(19267357507584L, 143553);
              }
            });
            CustomSmileyPreviewUI.m(CustomSmileyPreviewUI.this).setVisibility(8);
            GMTrace.o(19267760160768L, 143556);
            return;
            CustomSmileyPreviewUI.k(CustomSmileyPreviewUI.this).setVisibility(0);
            com.tencent.mm.ao.n.Jd().a(CustomSmileyPreviewUI.h(CustomSmileyPreviewUI.this).uqz.lRV, CustomSmileyPreviewUI.k(CustomSmileyPreviewUI.this), com.tencent.mm.plugin.emoji.e.f.bS(CustomSmileyPreviewUI.b(CustomSmileyPreviewUI.this).field_groupId, CustomSmileyPreviewUI.h(CustomSmileyPreviewUI.this).uqz.lRV));
          }
        }
        if ((CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this) != null) && (CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this).uqv != null))
        {
          CustomSmileyPreviewUI.i(CustomSmileyPreviewUI.this).setVisibility(0);
          CustomSmileyPreviewUI.j(CustomSmileyPreviewUI.this).setText(CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this).uqv.lPi);
          com.tencent.mm.ao.n.Jd().a(CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this).uqv.uhA, CustomSmileyPreviewUI.k(CustomSmileyPreviewUI.this), com.tencent.mm.plugin.emoji.e.f.bR(CustomSmileyPreviewUI.b(CustomSmileyPreviewUI.this).field_groupId, CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this).uqv.uhA));
          CustomSmileyPreviewUI.m(CustomSmileyPreviewUI.this).setVisibility(8);
          GMTrace.o(19267760160768L, 143556);
          return;
        }
        CustomSmileyPreviewUI.i(CustomSmileyPreviewUI.this).setVisibility(8);
        GMTrace.o(19267760160768L, 143556);
      }
    });
    GMTrace.o(17970680037376L, 133892);
  }
  
  private com.tencent.mm.plugin.emoji.a.a.c ask()
  {
    GMTrace.i(11381126463488L, 84796);
    Object localObject = new ArrayList();
    rh localrh = new rh();
    localrh.uhm = this.knO.uhm;
    localrh.lRV = this.knO.lRV;
    localrh.uhe = this.knO.uhe;
    localrh.uhj = this.knO.uhj;
    localrh.uhf = this.knO.uhf;
    localrh.uhn = this.knO.uhn;
    localrh.uhi = this.knO.uhi;
    localrh.uhh = this.knO.uhh;
    localrh.uhp = this.knO.uhp;
    localrh.uhq = this.knO.uhq;
    localrh.tRS = this.knO.tRS;
    ((List)localObject).add(new com.tencent.mm.plugin.emoji.a.a.f(localrh));
    localObject = new com.tencent.mm.plugin.emoji.a.a.c((List)localObject);
    GMTrace.o(11381126463488L, 84796);
    return (com.tencent.mm.plugin.emoji.a.a.c)localObject;
  }
  
  public final void H(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(11381529116672L, 84799);
    this.knB = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    at.wS().a(this.knB, 0);
    GMTrace.o(11381529116672L, 84799);
  }
  
  protected final void MP()
  {
    GMTrace.i(11380589592576L, 84792);
    sq("");
    Object localObject1 = getIntent().getStringExtra("custom_smiley_preview_md5");
    this.knU = getIntent().getLongExtra("msg_id", 0L);
    this.knV = getIntent().getStringExtra("msg_sender");
    this.knW = getIntent().getStringExtra("msg_content");
    w.d("MicroMsg.emoji.CustomSmileyPreviewUI", "[initView] md5:%s", new Object[] { localObject1 });
    String str = bg.nl((String)localObject1);
    if (TextUtils.isEmpty(str))
    {
      w.e("MicroMsg.emoji.CustomSmileyPreviewUI", "CustomSmileyPreviewUI ini fail md5 is fail");
      finish();
    }
    this.knQ = ((TextView)findViewById(R.h.bsP));
    final Object localObject3 = (MMEmojiView)findViewById(R.h.bsQ);
    if (com.tencent.mm.sdk.a.b.bPq()) {
      ((MMEmojiView)localObject3).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19268833902592L, 143564);
          Toast.makeText(CustomSmileyPreviewUI.this.vKB.vKW, "isHevc:" + localObject3.tBZ, 0).show();
          GMTrace.o(19268833902592L, 143564);
        }
      });
    }
    if (localObject3 == null)
    {
      w.e("MicroMsg.emoji.CustomSmileyPreviewUI", "CustomSmileyPreviewUI ini fail emojiView is null.");
      finish();
      GMTrace.o(11380589592576L, 84792);
      return;
    }
    this.iZN = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(str);
    Object localObject4;
    Object localObject5;
    label375:
    int i;
    if (this.iZN.bUP())
    {
      localObject1 = EmojiInfo.bd(this, this.iZN.getName());
      if (localObject1 != null)
      {
        ((MMEmojiView)localObject3).a((InputStream)localObject1, this.iZN.getName());
        localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(this.iZN.GS());
        if ((this.knQ != null) && (!bg.nm((String)localObject1)))
        {
          this.knQ.setText((CharSequence)localObject1);
          ((MMEmojiView)localObject3).setContentDescription((CharSequence)localObject1);
        }
        localObject4 = getIntent().getStringExtra("custom_smiley_preview_appid");
        localObject1 = getIntent().getStringExtra("custom_smiley_preview_appname");
        localObject3 = (TextView)findViewById(R.h.beS);
        localObject5 = com.tencent.mm.pluginsdk.model.app.g.aP((String)localObject4, true);
        if ((localObject5 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject5).field_appName != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject5).field_appName.trim().length() > 0)) {
          break label1140;
        }
        if ((localObject4 == null) || (((String)localObject4).length() <= 0)) {
          break label1174;
        }
        if ((localObject1 != null) && (((String)localObject1).trim().length() != 0) && (!((String)localObject1).equals("weixinfile")) && (!((String)localObject1).equals("invalid_appname"))) {
          break label1150;
        }
        i = 0;
        label428:
        if (i == 0) {
          break label1174;
        }
        ((TextView)localObject3).setText(getString(R.l.dhv, new Object[] { com.tencent.mm.pluginsdk.model.app.g.a(this.vKB.vKW, (com.tencent.mm.pluginsdk.model.app.f)localObject5, (String)localObject1) }));
        ((TextView)localObject3).setVisibility(0);
        localObject1 = new l.b();
        ((l.b)localObject1).appId = ((String)localObject4);
        ((l.b)localObject1).eRB = "message";
        ((View)localObject3).setTag(localObject1);
        ((View)localObject3).setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.l(this));
        localObject1 = com.tencent.mm.pluginsdk.model.app.g.b((String)localObject4, 2, com.tencent.mm.br.a.getDensity(this));
        if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
          break label1155;
        }
        a(this, (TextView)localObject3, (Bitmap)localObject1);
        label548:
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(11383945035776L, 84817);
            CustomSmileyPreviewUI.this.finish();
            GMTrace.o(11383945035776L, 84817);
            return true;
          }
        });
        if ((this.iZN.field_catalog == EmojiInfo.vCu) || (this.iZN.bUP())) {
          break label1616;
        }
      }
    }
    label952:
    label993:
    label1140:
    label1150:
    label1155:
    label1174:
    label1592:
    label1604:
    label1616:
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2;
      if ((this.iZN.field_catalog != EmojiInfo.vCu) && (!bg.nm(this.iZN.field_groupId)))
      {
        bool2 = bool1;
        if (!bg.nm(this.iZN.field_groupId))
        {
          bool2 = bool1;
          if (!((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vS(this.iZN.field_groupId)) {}
        }
      }
      else
      {
        bool2 = true;
      }
      a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(19264404717568L, 143531);
          CustomSmileyPreviewUI.f(CustomSmileyPreviewUI.this);
          GMTrace.o(19264404717568L, 143531);
          return true;
        }
      });
      lg(bool2);
      this.knJ = findViewById(R.h.btk);
      this.knK = ((ImageView)this.knJ.findViewById(R.h.btp));
      this.knL = ((TextView)this.knJ.findViewById(R.h.bty));
      this.knM = ((TextView)this.knJ.findViewById(R.h.btn));
      this.knJ.setVisibility(8);
      if ((this.iZN != null) && (!bg.nm(this.iZN.field_designerID)))
      {
        localObject1 = this.iZN.field_designerID;
        this.knN = com.tencent.mm.plugin.emoji.model.h.arl().kjE.UN((String)localObject1);
        localObject1 = new com.tencent.mm.plugin.emoji.f.i(this.iZN.field_designerID);
        at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      }
      if ((this.iZN != null) && (!bg.nm(this.iZN.field_activityid)))
      {
        localObject1 = this.iZN.field_activityid;
        this.knS = com.tencent.mm.plugin.emoji.model.h.arl().kjB.UT((String)localObject1);
        localObject1 = this.iZN.field_activityid;
        localObject3 = this.iZN.field_md5;
        if ((this.knS == null) || ((this.knS != null) && (this.knS.uqz != null) && (this.knS.uqz.ugR < System.currentTimeMillis() / 1000L)))
        {
          localObject1 = new com.tencent.mm.plugin.emoji.f.j((String)localObject1, (String)localObject3);
          at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
        }
      }
      else
      {
        asj();
        this.knJ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(19268162813952L, 143559);
            if ((CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this) != null) && (CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this).uqv != null))
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.setClass(CustomSmileyPreviewUI.this.vKB.vKW, EmojiStoreV2DesignerUI.class);
              paramAnonymousView.putExtra("uin", CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this).uqv.uqo);
              paramAnonymousView.putExtra("name", CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this).uqv.lPi);
              paramAnonymousView.putExtra("headurl", CustomSmileyPreviewUI.g(CustomSmileyPreviewUI.this).uqv.uhA);
              paramAnonymousView.putExtra("extra_scence", 9);
              CustomSmileyPreviewUI.this.vKB.vKW.startActivity(paramAnonymousView);
              GMTrace.o(19268162813952L, 143559);
              return;
            }
            w.i("MicroMsg.emoji.CustomSmileyPreviewUI", "simple designer info is null");
            GMTrace.o(19268162813952L, 143559);
          }
        });
        localObject4 = com.tencent.mm.plugin.report.service.g.ork;
        localObject5 = this.eEa;
        if (this.iZN != null) {
          break label1592;
        }
        localObject1 = "";
        if (this.iZN != null) {
          break label1604;
        }
      }
      for (localObject3 = "";; localObject3 = this.iZN.field_activityid)
      {
        ((com.tencent.mm.plugin.report.service.g)localObject4).i(12067, new Object[] { Integer.valueOf(2), localObject5, str, localObject1, localObject3 });
        GMTrace.o(11380589592576L, 84792);
        return;
        if (this.iZN == null) {}
        for (localObject1 = "null";; localObject1 = this.iZN.getName())
        {
          w.e("MicroMsg.emoji.CustomSmileyPreviewUI", "input stream is null. emoji name is:%s", new Object[] { localObject1 });
          break;
        }
        ((MMEmojiView)localObject3).a(this.iZN, "");
        if ((this.iZN == null) || (this.iZN.bUT())) {
          break;
        }
        com.tencent.mm.plugin.emoji.e.c.aqt();
        com.tencent.mm.plugin.emoji.e.c.a(this.iZN, true);
        break;
        localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject5).field_appName;
        break label375;
        i = 1;
        break label428;
        a(this, (TextView)localObject3, BitmapFactory.decodeResource(getResources(), R.g.aYz));
        break label548;
        ((TextView)localObject3).setVisibility(8);
        this.eEa = this.iZN.field_groupId;
        localObject1 = new com.tencent.mm.plugin.emoji.f.k(this.eEa);
        at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
        this.Ev = ((ListView)findViewById(16908298));
        this.knI = new com.tencent.mm.plugin.emoji.a.f(this.vKB.vKW);
        this.knI.khp = this;
        this.knI.kgI = true;
        this.knI.kgL = false;
        this.Ev.setOnItemClickListener(this);
        this.Ev.setAdapter(this.knI);
        this.knI.khn = this.Ev;
        if (!bg.nm(this.eEa))
        {
          localObject1 = com.tencent.mm.plugin.emoji.model.h.arl().kjC.UP(this.eEa);
          if ((localObject1 != null) && (((com.tencent.mm.storage.emotion.i)localObject1).field_content != null)) {
            localObject3 = new zy();
          }
        }
        try
        {
          ((zy)localObject3).aD(((com.tencent.mm.storage.emotion.i)localObject1).field_content);
          this.knO = ((zy)localObject3).uqD;
          this.knP = ((com.tencent.mm.storage.emotion.i)localObject1).field_lan;
          if ((this.knO == null) || (bg.nm(this.knP)) || (!this.knP.equalsIgnoreCase(v.eq(this.vKB.vKW))))
          {
            localObject1 = new com.tencent.mm.plugin.emoji.f.l(this.eEa, 1);
            at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
            this.knR = new com.tencent.mm.plugin.emoji.model.g();
            this.knR.iPn = this;
            this.knR.kkx = this.knI;
            this.knR.kkA = 9;
            this.knR.kkD = this;
            a(this.eEa, this.iZN);
          }
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            w.e("MicroMsg.emoji.CustomSmileyPreviewUI", "exception:%s", new Object[] { bg.f(localIOException) });
            continue;
            localObject2 = ask();
            if (this.knI != null) {
              this.knI.a((com.tencent.mm.plugin.emoji.a.a.c)localObject2);
            }
            localObject2 = new com.tencent.mm.plugin.emoji.f.l(this.eEa, 1, this.knO.jia);
            at.wS().a((com.tencent.mm.ad.k)localObject2, 0);
          }
        }
        w.i("MicroMsg.emoji.CustomSmileyPreviewUI", "no need to load emoji activity");
        break label952;
        Object localObject2 = this.iZN.field_designerID;
        break label993;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11380992245760L, 84795);
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(11380992245760L, 84795);
      return;
      paramString = (com.tencent.mm.plugin.emoji.f.l)paramk;
      if (paramInt1 == 0)
      {
        if (paramInt2 == 0)
        {
          this.knO = paramString.arz();
          if ((this.knO != null) && (!TextUtils.isEmpty(this.eEa)) && (this.eEa.equals(this.knO.tRS)))
          {
            paramString = ask();
            if (this.knI != null) {
              this.knI.a(paramString);
            }
            this.mHandler.sendEmptyMessage(0);
            w.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd]" + this.knO.tRS);
            GMTrace.o(11380992245760L, 84795);
            return;
          }
          paramk = this.eEa;
          if (this.knO == null) {}
          for (paramString = "";; paramString = this.knO.tRS)
          {
            w.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd no same product id] cureent:%s,scene:%s", new Object[] { paramk, paramString });
            GMTrace.o(11380992245760L, 84795);
            return;
          }
        }
        if (paramInt2 == 1) {
          GMTrace.o(11380992245760L, 84795);
        }
      }
      else if (paramInt2 == 5)
      {
        if ((this.knO != null) && (paramString.arz() != null) && (!TextUtils.isEmpty(this.eEa)) && (this.eEa.equals(this.knO.tRS)) && (this.knO.uhj != paramString.arz().uhj))
        {
          this.knO.uhj = paramString.arz().uhj;
          paramString = ask();
          if (this.knI != null) {
            this.knI.a(paramString);
          }
          this.mHandler.sendEmptyMessage(0);
          w.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd]" + this.knO.tRS);
          GMTrace.o(11380992245760L, 84795);
          return;
        }
        paramk = this.eEa;
        if (this.knO == null) {}
        for (paramString = "";; paramString = this.knO.tRS)
        {
          w.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd no same product id or PackFlag is same.] cureent:%s,scene:%s", new Object[] { paramk, paramString });
          GMTrace.o(11380992245760L, 84795);
          return;
        }
        if (paramInt2 == 0)
        {
          this.mHandler.sendEmptyMessage(2);
          this.mHandler.sendEmptyMessageDelayed(131077, 500L);
          GMTrace.o(11380992245760L, 84795);
          return;
          paramString = (com.tencent.mm.plugin.emoji.f.n)paramk;
          com.tencent.mm.plugin.emoji.model.h.arl().kjB.a(12, paramString.arB());
          GMTrace.o(11380992245760L, 84795);
          return;
          this.knN = ((com.tencent.mm.plugin.emoji.f.i)paramk).arx();
          asj();
          GMTrace.o(11380992245760L, 84795);
          return;
          if (paramInt2 == 0)
          {
            paramString = (com.tencent.mm.plugin.emoji.f.j)paramk;
            paramk = (zu)paramString.fUa.gtD.gtK;
            if ((paramk != null) && (paramk.uqz != null))
            {
              paramk.uqz.ugR = ((int)(System.currentTimeMillis() / 1000L) + paramk.uqz.ugR);
              com.tencent.mm.plugin.emoji.model.h.arl().kjB.a(paramString.klG, paramk);
            }
            this.knS = paramk;
            asj();
            GMTrace.o(11380992245760L, 84795);
            return;
          }
          w.w("MicroMsg.emoji.CustomSmileyPreviewUI", "get activity failed.");
        }
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    GMTrace.i(11381394898944L, 84798);
    String str2 = parama.apY();
    if (TextUtils.isEmpty(parama.aqa())) {}
    for (String str1 = "";; str1 = parama.aqa())
    {
      w.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { str2, str1, Integer.valueOf(parama.apZ()) });
      this.knR.a(parama);
      GMTrace.o(11381394898944L, 84798);
      return;
    }
  }
  
  public final void ard()
  {
    GMTrace.i(11381663334400L, 84800);
    GMTrace.o(11381663334400L, 84800);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11379784286208L, 84786);
    int i = R.i.cum;
    GMTrace.o(11379784286208L, 84786);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11379918503936L, 84787);
    super.onCreate(paramBundle);
    at.wS().a(412, this);
    at.wS().a(521, this);
    at.wS().a(411, this);
    at.wS().a(239, this);
    at.wS().a(368, this);
    com.tencent.mm.sdk.b.a.vgX.b(this.knA);
    com.tencent.mm.sdk.b.a.vgX.b(this.knX);
    MP();
    GMTrace.o(11379918503936L, 84787);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11380455374848L, 84791);
    at.wS().b(412, this);
    at.wS().b(521, this);
    at.wS().b(411, this);
    at.wS().b(239, this);
    at.wS().b(368, this);
    com.tencent.mm.sdk.b.a.vgX.c(this.knA);
    com.tencent.mm.sdk.b.a.vgX.c(this.knX);
    super.onDestroy();
    GMTrace.o(11380455374848L, 84791);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11381797552128L, 84801);
    if ((this.knI == null) || (paramInt < 0) || (paramInt >= this.knI.getCount()))
    {
      GMTrace.o(11381797552128L, 84801);
      return;
    }
    paramAdapterView = this.knI.mC(paramInt);
    paramView = new Intent();
    paramView.setClass(this, EmojiStoreDetailUI.class);
    Object localObject = paramAdapterView.khA;
    if (localObject == null) {
      paramAdapterView = null;
    }
    for (;;)
    {
      startActivity(paramAdapterView);
      GMTrace.o(11381797552128L, 84801);
      return;
      paramView.putExtra("extra_id", ((rh)localObject).tRS);
      paramView.putExtra("extra_name", ((rh)localObject).uhe);
      paramView.putExtra("extra_copyright", ((rh)localObject).uho);
      paramView.putExtra("extra_coverurl", ((rh)localObject).uhm);
      paramView.putExtra("extra_description", ((rh)localObject).uhf);
      paramView.putExtra("extra_price", ((rh)localObject).uhh);
      paramView.putExtra("extra_type", ((rh)localObject).uhi);
      paramView.putExtra("extra_flag", ((rh)localObject).uhj);
      paramView.putExtra("preceding_scence", 4);
      paramView.putExtra("call_by", 1);
      paramView.putExtra("download_entrance_scene", 9);
      paramView.putExtra("check_clickflag", true);
      paramView.putExtra("extra_status", paramAdapterView.mStatus);
      paramView.putExtra("extra_progress", paramAdapterView.rr);
      localObject = getIntent().getStringExtra("to_talker_name");
      paramAdapterView = paramView;
      if (!bg.nm((String)localObject))
      {
        paramView.putExtra("to_talker_name", (String)localObject);
        paramAdapterView = paramView;
      }
    }
  }
  
  public void onPause()
  {
    GMTrace.i(11380321157120L, 84790);
    super.onPause();
    GMTrace.o(11380321157120L, 84790);
  }
  
  protected void onResume()
  {
    GMTrace.i(11380052721664L, 84788);
    super.onResume();
    GMTrace.o(11380052721664L, 84788);
  }
  
  public void onStart()
  {
    GMTrace.i(11380186939392L, 84789);
    super.onStart();
    GMTrace.o(11380186939392L, 84789);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\CustomSmileyPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */