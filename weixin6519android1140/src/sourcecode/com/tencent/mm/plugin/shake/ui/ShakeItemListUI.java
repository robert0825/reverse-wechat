package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.shake.d.a.i;
import com.tencent.mm.plugin.shake.d.a.i.1;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b.a;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;

public class ShakeItemListUI
  extends MMActivity
{
  private com.tencent.mm.ao.a.a gJI;
  private View iBW;
  private int id;
  private p.d jqg;
  private ListView ntX;
  public long oPf;
  private boolean oPg;
  private a oPh;
  private int showType;
  
  public ShakeItemListUI()
  {
    GMTrace.i(6536671789056L, 48702);
    this.oPf = 0L;
    this.oPg = false;
    this.gJI = null;
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6566199689216L, 48922);
        com.tencent.mm.plugin.shake.b.m.bfk().tM(ShakeItemListUI.f(ShakeItemListUI.this));
        GMTrace.o(6566199689216L, 48922);
      }
    };
    GMTrace.o(6536671789056L, 48702);
  }
  
  public static int tU(int paramInt)
  {
    GMTrace.i(6537745530880L, 48710);
    switch (paramInt)
    {
    default: 
      paramInt = R.l.ebD;
      GMTrace.o(6537745530880L, 48710);
      return paramInt;
    case 100: 
      paramInt = R.l.ebG;
      GMTrace.o(6537745530880L, 48710);
      return paramInt;
    case -1: 
    case 0: 
      paramInt = R.l.ebD;
      GMTrace.o(6537745530880L, 48710);
      return paramInt;
    case -5: 
    case 4: 
      paramInt = R.l.eca;
      GMTrace.o(6537745530880L, 48710);
      return paramInt;
    case -6: 
    case 5: 
      paramInt = R.l.ecs;
      GMTrace.o(6537745530880L, 48710);
      return paramInt;
    }
    paramInt = R.l.ebJ;
    GMTrace.o(6537745530880L, 48710);
    return paramInt;
  }
  
  protected final void MP()
  {
    GMTrace.i(6536940224512L, 48704);
    this.gJI = new com.tencent.mm.ao.a.a(this);
    at.AR();
    final int i = bg.a((Integer)com.tencent.mm.y.c.xh().get(12290, null), 0);
    this.showType = getIntent().getIntExtra("_key_show_type_", 0);
    final Object localObject = getIntent().getStringExtra("_key_title_");
    if (!bg.nm((String)localObject)) {
      sq((String)localObject);
    }
    this.oPg = getIntent().getBooleanExtra("_key_show_from_shake_", false);
    a(0, getString(R.l.cSl), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6544053764096L, 48757);
        com.tencent.mm.ui.base.h.a(ShakeItemListUI.this, true, ShakeItemListUI.this.getString(R.l.dUP), "", ShakeItemListUI.this.getString(R.l.cSl), ShakeItemListUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6544322199552L, 48759);
            switch (ShakeItemListUI.a(ShakeItemListUI.this))
            {
            }
            for (;;)
            {
              ShakeItemListUI.b(ShakeItemListUI.this).QF();
              ShakeItemListUI.c(ShakeItemListUI.this).setVisibility(8);
              paramAnonymous2DialogInterface = (TextView)ShakeItemListUI.this.findViewById(R.h.bPM);
              paramAnonymous2DialogInterface.setText(ShakeItemListUI.tU(ShakeItemListUI.a(ShakeItemListUI.this)));
              paramAnonymous2DialogInterface.setVisibility(0);
              ShakeItemListUI.this.lf(false);
              GMTrace.o(6544322199552L, 48759);
              return;
              com.tencent.mm.plugin.shake.b.m.bfk().tN(0);
              com.tencent.mm.plugin.shake.b.m.bfk().bfb();
              continue;
              com.tencent.mm.plugin.shake.b.m.bfk().tN(0);
              continue;
              at.xB().A(new i.1());
              com.tencent.mm.plugin.shake.b.m.bfk().tN(4);
              continue;
              com.tencent.mm.plugin.shake.b.m.bfk().tN(7);
              com.tencent.mm.plugin.shake.b.m.bfk().tN(6);
              com.tencent.mm.plugin.shake.b.m.bfk().tN(8);
              com.tencent.mm.plugin.shake.b.m.bfk().tN(9);
              com.tencent.mm.plugin.shake.b.m.bfk().tN(10);
              com.tencent.mm.plugin.shake.b.m.bfk().tN(12);
              continue;
              com.tencent.mm.plugin.shake.b.m.bfk().tN(11);
            }
          }
        }, null);
        GMTrace.o(6544053764096L, 48757);
        return true;
      }
    });
    this.ntX = ((ListView)findViewById(R.h.bPK));
    this.iBW = getLayoutInflater().inflate(R.i.cGo, null);
    this.iBW.findViewById(R.h.cdj).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6569018261504L, 48943);
        ShakeItemListUI.a(ShakeItemListUI.this, ShakeItemListUI.a(ShakeItemListUI.this) ^ 0xFFFFFFFF);
        ShakeItemListUI.this.tT(ShakeItemListUI.a(ShakeItemListUI.this));
        GMTrace.o(6569018261504L, 48943);
      }
    });
    this.ntX.addFooterView(this.iBW);
    if (this.showType == -1)
    {
      this.iBW.findViewById(R.h.cdj).setVisibility(0);
      this.oPh = new a(this);
      this.oPh.tT(this.showType);
      if (this.oPh.getCount() > 0) {
        break label333;
      }
      this.ntX.setVisibility(8);
      localObject = (TextView)findViewById(R.h.bPM);
      ((TextView)localObject).setText(tU(this.showType));
      ((TextView)localObject).setVisibility(0);
      lf(false);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6573313228800L, 48975);
          ShakeItemListUI.this.aLo();
          ShakeItemListUI.this.finish();
          GMTrace.o(6573313228800L, 48975);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6572776357888L, 48971);
          BackwardSupportUtil.c.a(ShakeItemListUI.c(ShakeItemListUI.this));
          GMTrace.o(6572776357888L, 48971);
        }
      };
      this.ntX.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(6566870777856L, 48927);
          if (ShakeItemListUI.b(ShakeItemListUI.this) != null)
          {
            paramAnonymousView = ShakeItemListUI.b(ShakeItemListUI.this);
            if (paramAnonymousView.gCY != null) {
              paramAnonymousView.gCY.onTouchEvent(paramAnonymousMotionEvent);
            }
          }
          GMTrace.o(6566870777856L, 48927);
          return false;
        }
      });
      GMTrace.o(6536940224512L, 48704);
      return;
      this.iBW.findViewById(R.h.cdj).setVisibility(8);
      break;
      label333:
      this.ntX.setAdapter(this.oPh);
      this.ntX.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6539087708160L, 48720);
          paramAnonymousAdapterView = (com.tencent.mm.plugin.shake.b.d)ShakeItemListUI.b(ShakeItemListUI.this).getItem(paramAnonymousInt);
          if (paramAnonymousAdapterView == null)
          {
            GMTrace.o(6539087708160L, 48720);
            return;
          }
          paramAnonymousView = com.tencent.mm.plugin.shake.b.m.bfk();
          int i;
          if (paramAnonymousAdapterView == null)
          {
            w.w("MicroMsg.NewShakeItemStorage", "setRead, but item is null");
            i = paramAnonymousAdapterView.field_type;
            if (i != 4) {
              break label219;
            }
            paramAnonymousView = new Intent();
            if (!com.tencent.mm.at.c.JZ()) {
              break label186;
            }
            com.tencent.mm.at.b.b(i.a(paramAnonymousAdapterView.field_lvbuffer, 0L));
          }
          for (;;)
          {
            paramAnonymousView.putExtra("key_scene", 3);
            com.tencent.mm.bj.d.b(ShakeItemListUI.this, "music", ".ui.MusicMainUI", paramAnonymousView);
            GMTrace.o(6539087708160L, 48720);
            return;
            paramAnonymousAdapterView.field_insertBatch = 1;
            paramAnonymousAdapterView.eQl = 1024;
            if (-1 == paramAnonymousView.fTZ.update("shakeitem1", paramAnonymousAdapterView.qL(), "shakeItemID=? and insertBatch=?", new String[] { paramAnonymousAdapterView.field_shakeItemID, "2" })) {
              break;
            }
            paramAnonymousView.doNotify();
            break;
            label186:
            com.tencent.mm.at.b.JO();
            paramAnonymousView.putExtra("key_mode", 1);
            paramAnonymousView.putExtra("KGlobalShakeMusic", true);
            com.tencent.mm.at.b.c(i.a(paramAnonymousAdapterView.field_lvbuffer, 0L));
          }
          label219:
          if (i == 11)
          {
            if (System.currentTimeMillis() - ShakeItemListUI.this.oPf > 2000L)
            {
              ShakeItemListUI.this.oPf = System.currentTimeMillis();
              if ((paramAnonymousAdapterView.field_reserved3 == null) || (paramAnonymousAdapterView.field_reserved3.split(",").length != 3) || (paramAnonymousAdapterView.field_reserved3.split(",")[0] == null) || (paramAnonymousAdapterView.field_reserved3.split(",")[0].equals(""))) {
                break label415;
              }
              paramAnonymousView = paramAnonymousAdapterView.field_reserved3.split(",");
              localObject = new qi();
              ((qi)localObject).eUY.userName = paramAnonymousView[0];
              ((qi)localObject).eUY.eVa = bg.aq(paramAnonymousView[1], "");
              ((qi)localObject).eUY.eVb = Integer.parseInt(paramAnonymousView[2]);
              ((qi)localObject).eUY.scene = 1077;
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            }
            for (;;)
            {
              if (ShakeItemListUI.d(ShakeItemListUI.this))
              {
                com.tencent.mm.plugin.shake.d.a.h.a(paramAnonymousAdapterView);
                com.tencent.mm.plugin.shake.d.a.h.b(paramAnonymousAdapterView);
              }
              GMTrace.o(6539087708160L, 48720);
              return;
              label415:
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("rawUrl", paramAnonymousAdapterView.getCity());
              paramAnonymousView.putExtra("scene", 27);
              paramAnonymousView.putExtra("stastic_scene", 5);
              com.tencent.mm.bj.d.b(ab.getContext(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
            }
          }
          if (k.tR(i))
          {
            k.a(paramAnonymousAdapterView, ShakeItemListUI.this, true);
            GMTrace.o(6539087708160L, 48720);
            return;
          }
          paramAnonymousView = paramAnonymousAdapterView.field_username;
          at.AR();
          Object localObject = com.tencent.mm.y.c.yK().TE(paramAnonymousView);
          w.d("MicroMsg.ShakeItemListUI", "listView onTtemClick username:" + paramAnonymousView + " display:" + paramAnonymousAdapterView.field_nickname + " position:" + paramAnonymousInt + " contactName" + ((com.tencent.mm.g.b.af)localObject).field_username);
          w.d("MicroMsg.ShakeItemListUI", "isContact:" + com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type) + "  contact:" + localObject);
          if (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type))
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("Contact_User", paramAnonymousView);
            if (i == paramAnonymousAdapterView.field_sex) {}
            for (paramAnonymousInt = 23;; paramAnonymousInt = 24)
            {
              localIntent.putExtra("Contact_Scene", paramAnonymousInt);
              localIntent.putExtra("Sns_from_Scene", 22);
              if ((paramAnonymousView != null) && (paramAnonymousView.length() > 0))
              {
                if (((x)localObject).bSA())
                {
                  g.ork.A(10298, paramAnonymousAdapterView.field_username + "," + localIntent.getIntExtra("Contact_Scene", 23));
                  localIntent.putExtra("Contact_Scene", 23);
                }
                com.tencent.mm.plugin.shake.a.hnH.d(localIntent, ShakeItemListUI.this);
              }
              GMTrace.o(6539087708160L, 48720);
              return;
            }
          }
          w.d("MicroMsg.ShakeItemListUI", "listView onTtemClick username:" + paramAnonymousView + " display:" + paramAnonymousAdapterView.field_nickname + " position:" + paramAnonymousInt + " contactName" + ((com.tencent.mm.g.b.af)localObject).field_username);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.field_username);
          paramAnonymousView.putExtra("Contact_Nick", paramAnonymousAdapterView.field_nickname);
          paramAnonymousView.putExtra("Contact_Distance", paramAnonymousAdapterView.field_distance);
          paramAnonymousView.putExtra("Contact_Signature", paramAnonymousAdapterView.field_signature);
          paramAnonymousView.putExtra("Contact_Province", paramAnonymousAdapterView.getProvince());
          paramAnonymousView.putExtra("Contact_City", paramAnonymousAdapterView.getCity());
          paramAnonymousView.putExtra("Contact_Sex", paramAnonymousAdapterView.field_sex);
          paramAnonymousView.putExtra("Contact_IsLBSFriend", true);
          paramAnonymousView.putExtra("Contact_VUser_Info", paramAnonymousAdapterView.field_reserved3);
          paramAnonymousView.putExtra("Contact_VUser_Info_Flag", paramAnonymousAdapterView.field_reserved1);
          if (i == paramAnonymousAdapterView.field_sex) {}
          for (paramAnonymousInt = 23;; paramAnonymousInt = 24)
          {
            paramAnonymousView.putExtra("Contact_Scene", paramAnonymousInt);
            paramAnonymousView.putExtra("Sns_from_Scene", 22);
            paramAnonymousView.putExtra("Contact_KSnsIFlag", paramAnonymousAdapterView.field_snsFlag);
            paramAnonymousView.putExtra("Contact_KSnsBgUrl", paramAnonymousAdapterView.field_sns_bgurl);
            if ((paramAnonymousAdapterView.field_reserved1 & 0x8) > 0) {
              g.ork.A(10298, paramAnonymousAdapterView.field_username + "," + paramAnonymousView.getIntExtra("Contact_Scene", 23));
            }
            com.tencent.mm.plugin.shake.a.hnH.d(paramAnonymousView, ShakeItemListUI.this);
            GMTrace.o(6539087708160L, 48720);
            return;
          }
        }
      });
      localObject = new l(this);
      this.ntX.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6535061176320L, 48690);
          if (paramAnonymousInt < ShakeItemListUI.c(ShakeItemListUI.this).getHeaderViewsCount())
          {
            w.w("MicroMsg.ShakeItemListUI", "on header view long click, ignore");
            GMTrace.o(6535061176320L, 48690);
            return true;
          }
          localObject.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, ShakeItemListUI.this, ShakeItemListUI.e(ShakeItemListUI.this));
          GMTrace.o(6535061176320L, 48690);
          return true;
        }
      });
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6537611313152L, 48709);
    int i = R.i.cGm;
    GMTrace.o(6537611313152L, 48709);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6536806006784L, 48703);
    super.onCreate(paramBundle);
    MP();
    com.tencent.mm.plugin.shake.b.m.bfk().c(this.oPh);
    this.oPh.QG();
    w.i("MicroMsg.ShakeItemListUI", "onResume");
    GMTrace.o(6536806006784L, 48703);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(6537074442240L, 48705);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.id = ((com.tencent.mm.plugin.shake.b.d)this.oPh.getItem(paramView.position)).field_shakeItemID;
    paramContextMenu.add(paramView.position, 0, 0, R.l.cSt);
    GMTrace.o(6537074442240L, 48705);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6537342877696L, 48707);
    this.oPh.aJe();
    a locala = this.oPh;
    if (locala.gCY != null)
    {
      locala.gCY.detach();
      locala.gCY = null;
    }
    com.tencent.mm.plugin.shake.b.m.bfk().j(this.oPh);
    w.i("MicroMsg.ShakeItemListUI", "onPause");
    if (this.gJI != null) {
      this.gJI.detach();
    }
    super.onDestroy();
    GMTrace.o(6537342877696L, 48707);
  }
  
  protected void onPause()
  {
    GMTrace.i(6537208659968L, 48706);
    super.onPause();
    GMTrace.o(6537208659968L, 48706);
  }
  
  protected final void tT(int paramInt)
  {
    GMTrace.i(6537477095424L, 48708);
    this.oPh.tT(paramInt);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6537477095424L, 48708);
      return;
      if (this.iBW != null)
      {
        this.iBW.findViewById(R.h.cdj).setVisibility(8);
        GMTrace.o(6537477095424L, 48708);
        return;
        if (this.iBW != null) {
          this.iBW.findViewById(R.h.cdj).setVisibility(0);
        }
      }
    }
  }
  
  final class a
    extends o<com.tencent.mm.plugin.shake.b.d>
  {
    com.tencent.mm.ui.applet.b gCY;
    private b.b gCZ;
    private int showType;
    
    public a(ShakeItemListUI paramShakeItemListUI)
    {
      super(new com.tencent.mm.plugin.shake.b.d());
      GMTrace.i(6539221925888L, 48721);
      this.showType = 0;
      this.gCZ = null;
      this.gCY = new com.tencent.mm.ui.applet.b(new b.a()
      {
        public final Bitmap jP(String paramAnonymousString)
        {
          GMTrace.i(6565931253760L, 48920);
          paramAnonymousString = com.tencent.mm.ac.b.a(paramAnonymousString, false, -1);
          GMTrace.o(6565931253760L, 48920);
          return paramAnonymousString;
        }
      });
      QG();
      GMTrace.o(6539221925888L, 48721);
    }
    
    public final void QF()
    {
      GMTrace.i(6539624579072L, 48724);
      if (!at.AU())
      {
        GMTrace.o(6539624579072L, 48724);
        return;
      }
      switch (this.showType)
      {
      }
      for (;;)
      {
        super.notifyDataSetChanged();
        GMTrace.o(6539624579072L, 48724);
        return;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc ", new String[0]));
        continue;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", new String[] { "0" }));
        continue;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by reserved2 desc, shakeItemID desc ", new String[] { "0", "2" }));
        continue;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().beZ());
        continue;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", new String[] { "4", "2" }));
        continue;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type in (?, ?, ?, ?, ?) order by shakeItemID desc ", new String[] { "7", "6", "8", "9", "10", "12" }));
        continue;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", new String[] { "8", "2" }));
        continue;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", new String[] { "11" }));
        continue;
        setCursor(com.tencent.mm.plugin.shake.b.m.bfk().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc limit ? ", new String[] { "11", String.valueOf(ShakeItemListUI.this.getIntent().getIntExtra("_ibeacon_new_insert_size", 2)) }));
      }
    }
    
    protected final void QG()
    {
      GMTrace.i(6539490361344L, 48723);
      aJe();
      QF();
      GMTrace.o(6539490361344L, 48723);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6539356143616L, 48722);
      if (this.gCZ == null) {
        this.gCZ = new b.b()
        {
          public final int Hk()
          {
            GMTrace.i(6542711586816L, 48747);
            int i = ShakeItemListUI.a.this.getCount();
            GMTrace.o(6542711586816L, 48747);
            return i;
          }
          
          public final String gc(int paramAnonymousInt)
          {
            GMTrace.i(6542577369088L, 48746);
            if ((paramAnonymousInt < 0) || (paramAnonymousInt >= ShakeItemListUI.a.this.getCount()))
            {
              w.e("MicroMsg.ShakeFriendAdapter", "pos is invalid");
              GMTrace.o(6542577369088L, 48746);
              return null;
            }
            Object localObject = (com.tencent.mm.plugin.shake.b.d)ShakeItemListUI.a.this.getItem(paramAnonymousInt);
            if (localObject == null)
            {
              GMTrace.o(6542577369088L, 48746);
              return null;
            }
            localObject = ((com.tencent.mm.plugin.shake.b.d)localObject).field_username;
            GMTrace.o(6542577369088L, 48746);
            return (String)localObject;
          }
        };
      }
      if (this.gCY != null) {
        this.gCY.a(paramInt, this.gCZ);
      }
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = View.inflate(this.context, R.i.cGn, null);
        paramViewGroup.gDc = ((ImageView)paramView.findViewById(R.h.bPF));
        paramViewGroup.gDd = ((TextView)paramView.findViewById(R.h.bPL));
        paramViewGroup.gDe = ((TextView)paramView.findViewById(R.h.bPI));
        paramViewGroup.oPn = ((ImageView)paramView.findViewById(R.h.bPN));
        paramViewGroup.nut = ((TextView)paramView.findViewById(R.h.bPG));
        paramViewGroup.nuu = ((TextView)paramView.findViewById(R.h.bPO));
        paramViewGroup.nuv = ((ImageView)paramView.findViewById(R.h.bPQ));
        paramViewGroup.oPo = ((TextView)paramView.findViewById(R.h.cdX));
        paramViewGroup.oPm = paramView.findViewById(R.h.bYR);
        paramViewGroup.oPp = ((LinearLayout)paramView.findViewById(R.h.cdl));
        paramViewGroup.oPq = ((TextView)paramView.findViewById(R.h.cdm));
        paramView.setTag(paramViewGroup);
      }
      Object localObject1;
      for (;;)
      {
        localObject1 = (com.tencent.mm.plugin.shake.b.d)getItem(paramInt);
        if (localObject1 != null) {
          break;
        }
        paramViewGroup.clear();
        GMTrace.o(6539356143616L, 48722);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.clear();
      if ((4 == ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) || ((k.tR(((com.tencent.mm.plugin.shake.b.d)localObject1).field_type)) && (6 != ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type)))
      {
        if (4 != ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) {
          paramViewGroup.gDc.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        e.a(paramViewGroup.gDc, ((com.tencent.mm.plugin.shake.b.d)localObject1).field_sns_bgurl, R.k.cJr, false);
        paramViewGroup.gDc.setVisibility(0);
        if ((7 != ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) && (10 != ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) && (12 != ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) && (13 != ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) && ((8 != ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) || (!bg.nm(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname)) || (!bg.nm(((com.tencent.mm.plugin.shake.b.d)localObject1).field_username)))) {
          break label527;
        }
        if (8 != ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) {
          break label512;
        }
        paramViewGroup.oPq.setText(((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance);
      }
      for (;;)
      {
        paramViewGroup.oPq.setVisibility(0);
        paramViewGroup.oPp.setVisibility(8);
        GMTrace.o(6539356143616L, 48722);
        return paramView;
        if (11 == ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type)
        {
          ShakeItemListUI.g(ShakeItemListUI.this).a(((com.tencent.mm.plugin.shake.b.d)localObject1).getProvince(), paramViewGroup.gDc);
          break;
        }
        a.b.a(paramViewGroup.gDc, ((com.tencent.mm.plugin.shake.b.d)localObject1).field_username);
        break;
        label512:
        paramViewGroup.oPq.setText(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname);
      }
      label527:
      paramViewGroup.oPq.setVisibility(8);
      paramViewGroup.oPp.setVisibility(0);
      if ((8 == ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type) && (bg.nm(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname)))
      {
        ((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname = ((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance;
        ((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance = ((com.tencent.mm.plugin.shake.b.d)localObject1).field_username;
      }
      Object localObject2 = bg.nl(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname);
      paramViewGroup.gDd.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, (CharSequence)localObject2, paramViewGroup.gDd.getTextSize()));
      paramViewGroup.gDd.setVisibility(0);
      paramInt = paramView.getPaddingBottom();
      int i = paramView.getPaddingTop();
      int j = paramView.getPaddingRight();
      int k = paramView.getPaddingLeft();
      if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_insertBatch == 2)
      {
        paramView.setBackgroundDrawable(com.tencent.mm.br.a.b(this.context, R.g.aVN));
        paramView.setPadding(k, i, j, paramInt);
        switch (((com.tencent.mm.plugin.shake.b.d)localObject1).field_type)
        {
        default: 
          paramViewGroup.oPm.setVisibility(0);
          paramViewGroup.nut.setText(((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance);
          paramViewGroup.nut.setVisibility(0);
          if ((((com.tencent.mm.plugin.shake.b.d)localObject1).field_signature == null) || (((com.tencent.mm.plugin.shake.b.d)localObject1).field_signature.trim().equals("")))
          {
            paramViewGroup.nuu.setVisibility(8);
            label778:
            if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex != 1) {
              break label1083;
            }
            paramViewGroup.oPn.setVisibility(0);
            paramViewGroup.oPn.setImageDrawable(com.tencent.mm.br.a.b(this.context, R.k.cMN));
            paramViewGroup.oPn.setContentDescription(this.context.getString(R.l.dIg));
            label829:
            at.AR();
            localObject2 = com.tencent.mm.y.c.yK().TE(((com.tencent.mm.plugin.shake.b.d)localObject1).field_username);
            if ((localObject2 == null) || (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject2).field_type))) {
              break label1169;
            }
            paramViewGroup.gDe.setVisibility(0);
            if (!x.At(((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1)) {
              break label1149;
            }
            paramViewGroup.gDe.setText(this.context.getString(R.l.dKI));
            label900:
            if (6 == ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type)
            {
              paramViewGroup.nut.setText(this.context.getString(R.l.ebF));
              paramViewGroup.gDe.setVisibility(8);
            }
            if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1 == 0) {
              break label1181;
            }
            paramViewGroup.nuv.setVisibility(0);
            localObject1 = BackwardSupportUtil.b.c(ak.a.gmZ.fr(((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1), 2.0F);
            paramViewGroup.nuv.setImageBitmap((Bitmap)localObject1);
            paramViewGroup.oPn.setVisibility(8);
          }
          break;
        }
      }
      for (;;)
      {
        GMTrace.o(6539356143616L, 48722);
        return paramView;
        paramView.setBackgroundDrawable(com.tencent.mm.br.a.b(this.context, R.g.aVO));
        break;
        paramViewGroup.oPo.setText(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname);
        paramViewGroup.oPo.setVisibility(0);
        GMTrace.o(6539356143616L, 48722);
        return paramView;
        paramViewGroup.nuu.setVisibility(0);
        paramViewGroup.nuu.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, ((com.tencent.mm.plugin.shake.b.d)localObject1).field_signature, paramViewGroup.gDd.getTextSize()));
        break label778;
        label1083:
        if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex == 2)
        {
          paramViewGroup.oPn.setVisibility(0);
          paramViewGroup.oPn.setImageDrawable(com.tencent.mm.br.a.b(this.context, R.k.cMM));
          paramViewGroup.oPn.setContentDescription(this.context.getString(R.l.dvo));
          break label829;
        }
        paramViewGroup.oPn.setVisibility(8);
        break label829;
        label1149:
        paramViewGroup.gDe.setText(this.context.getString(R.l.dKK));
        break label900;
        label1169:
        paramViewGroup.gDe.setVisibility(8);
        break label900;
        label1181:
        paramViewGroup.nuv.setVisibility(8);
      }
    }
    
    protected final void tT(int paramInt)
    {
      GMTrace.i(6539758796800L, 48725);
      this.showType = paramInt;
      QG();
      GMTrace.o(6539758796800L, 48725);
    }
    
    final class a
    {
      ImageView gDc;
      TextView gDd;
      TextView gDe;
      TextView nut;
      TextView nuu;
      ImageView nuv;
      View oPm;
      ImageView oPn;
      TextView oPo;
      LinearLayout oPp;
      TextView oPq;
      
      a()
      {
        GMTrace.i(6565260165120L, 48915);
        GMTrace.o(6565260165120L, 48915);
      }
      
      public final void clear()
      {
        GMTrace.i(6565394382848L, 48916);
        if (this.gDc != null)
        {
          this.gDc.setImageDrawable(null);
          this.gDc.setVisibility(8);
        }
        if (this.gDd != null)
        {
          this.gDd.setText("");
          this.gDd.setVisibility(8);
        }
        if (this.gDe != null) {
          this.gDe.setVisibility(8);
        }
        if (this.oPn != null) {
          this.oPn.setVisibility(8);
        }
        if (this.nut != null)
        {
          this.nut.setText("");
          this.nut.setVisibility(8);
        }
        if (this.nuu != null)
        {
          this.nuu.setVisibility(8);
          this.oPm.setVisibility(8);
        }
        if (this.nuv != null) {
          this.nuv.setVisibility(8);
        }
        if (this.oPo != null)
        {
          this.oPo.setText("");
          this.oPo.setVisibility(8);
        }
        GMTrace.o(6565394382848L, 48916);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\ShakeItemListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */