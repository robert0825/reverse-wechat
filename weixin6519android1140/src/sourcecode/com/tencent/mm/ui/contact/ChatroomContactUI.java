package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout.b;
import com.tencent.mm.pluginsdk.ui.tools.p.a;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.t.a;
import com.tencent.mm.ui.voicesearch.VoiceSearchResultUI;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import java.io.IOException;

public class ChatroomContactUI
  extends MMActivity
  implements com.tencent.mm.ad.e, j.a
{
  private com.tencent.mm.pluginsdk.ui.d jNJ;
  private int juH;
  private int juI;
  private com.tencent.mm.ui.widget.h juL;
  private p.d kIF;
  private TextView ldw;
  private ListView mvH;
  private VoiceSearchLayout vIF;
  private com.tencent.mm.ui.voicesearch.b wPM;
  private String wPO;
  private ContactCountView wPZ;
  private com.tencent.mm.pluginsdk.ui.tools.p wQU;
  private d wQV;
  
  public ChatroomContactUI()
  {
    GMTrace.i(1807510142976L, 13467);
    this.juH = 0;
    this.juI = 0;
    this.kIF = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(1821871439872L, 13574);
        switch (paramAnonymousMenuItem.getItemId())
        {
        default: 
          GMTrace.o(1821871439872L, 13574);
          return;
        }
        ChatroomContactUI.Ww(ChatroomContactUI.a(ChatroomContactUI.this));
        GMTrace.o(1821871439872L, 13574);
      }
    };
    this.jNJ = new com.tencent.mm.pluginsdk.ui.d(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1779861291008L, 13261);
        GMTrace.o(1779861291008L, 13261);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(1779727073280L, 13260);
        GMTrace.o(1779727073280L, 13260);
      }
    });
    GMTrace.o(1807510142976L, 13467);
  }
  
  private void aJY()
  {
    GMTrace.i(1808583884800L, 13475);
    if (this.wQV != null) {
      this.wQV.a(null, null);
    }
    if (this.wPM != null) {
      this.wPM.a(null, null);
    }
    GMTrace.o(1808583884800L, 13475);
  }
  
  public final void MP()
  {
    GMTrace.i(1808047013888L, 13471);
    ((TextView)findViewById(R.h.bwQ)).setVisibility(8);
    this.mvH = ((ListView)findViewById(R.h.bcT));
    this.mvH.setAdapter(null);
    this.ldw = ((TextView)findViewById(R.h.bwQ));
    this.ldw.setText(R.l.cQU);
    this.wQV = new d(this, "@all.chatroom.contact");
    this.wQV.lb(true);
    this.wPM = new com.tencent.mm.ui.voicesearch.b(this.vKB.vKW, 1);
    this.wPM.wPl = "@all.chatroom.contact";
    this.wQU = new com.tencent.mm.pluginsdk.ui.tools.p((byte)0);
    this.wQU.a(new p.a()
    {
      public final void QA()
      {
        GMTrace.i(1783216734208L, 13286);
        GMTrace.o(1783216734208L, 13286);
      }
      
      public final void QB()
      {
        GMTrace.i(16857612419072L, 125599);
        GMTrace.o(16857612419072L, 125599);
      }
      
      public final void Qy()
      {
        GMTrace.i(1783485169664L, 13288);
        GMTrace.o(1783485169664L, 13288);
      }
      
      public final void Qz()
      {
        GMTrace.i(1783619387392L, 13289);
        GMTrace.o(1783619387392L, 13289);
      }
      
      public final void a(boolean paramAnonymousBoolean, String[] paramAnonymousArrayOfString, long paramAnonymousLong, int paramAnonymousInt)
      {
        GMTrace.i(1784022040576L, 13292);
        w.v("MicroMsg.ChatroomContactUI", "onVoiceReturn");
        if (paramAnonymousBoolean)
        {
          Intent localIntent = new Intent(ChatroomContactUI.this.vKB.vKW, VoiceSearchResultUI.class);
          localIntent.putExtra("VoiceSearchResultUI_Resultlist", paramAnonymousArrayOfString);
          localIntent.putExtra("VoiceSearchResultUI_VoiceId", paramAnonymousLong);
          localIntent.putExtra("VoiceSearchResultUI_ShowType", paramAnonymousInt);
          ChatroomContactUI.this.vKB.vKW.startActivity(localIntent);
          GMTrace.o(1784022040576L, 13292);
          return;
        }
        paramAnonymousArrayOfString = new Intent(ChatroomContactUI.this.vKB.vKW, VoiceSearchResultUI.class);
        paramAnonymousArrayOfString.putExtra("VoiceSearchResultUI_Resultlist", new String[0]);
        paramAnonymousArrayOfString.putExtra("VoiceSearchResultUI_Error", ChatroomContactUI.this.vKB.vKW.getString(R.l.dwI));
        paramAnonymousArrayOfString.putExtra("VoiceSearchResultUI_VoiceId", paramAnonymousLong);
        paramAnonymousArrayOfString.putExtra("VoiceSearchResultUI_ShowType", paramAnonymousInt);
        ChatroomContactUI.this.vKB.vKW.startActivity(paramAnonymousArrayOfString);
        GMTrace.o(1784022040576L, 13292);
      }
      
      public final void aim()
      {
        GMTrace.i(1783753605120L, 13290);
        w.v("MicroMsg.ChatroomContactUI", "onVoiceSearchStart");
        ChatroomContactUI.this.aLo();
        GMTrace.o(1783753605120L, 13290);
      }
      
      public final void ain()
      {
        GMTrace.i(1783887822848L, 13291);
        GMTrace.o(1783887822848L, 13291);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(1784156258304L, 13293);
        GMTrace.o(1784156258304L, 13293);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(1783350951936L, 13287);
        w.d("MicroMsg.ChatroomContactUI", "onSearchBarChange %s", new Object[] { paramAnonymousString });
        paramAnonymousString = t.nk(paramAnonymousString);
        ChatroomContactUI.a(ChatroomContactUI.this, paramAnonymousString);
        GMTrace.o(1783350951936L, 13287);
      }
    });
    a(this.wQU);
    this.wQV.a(new MMSlideDelView.c()
    {
      public final int cf(View paramAnonymousView)
      {
        GMTrace.i(1738253795328L, 12951);
        int i = ChatroomContactUI.b(ChatroomContactUI.this).getPositionForView(paramAnonymousView);
        GMTrace.o(1738253795328L, 12951);
        return i;
      }
    });
    this.wQV.a(new MMSlideDelView.f()
    {
      public final void t(View paramAnonymousView, int paramAnonymousInt)
      {
        GMTrace.i(1842406752256L, 13727);
        ChatroomContactUI.b(ChatroomContactUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
        GMTrace.o(1842406752256L, 13727);
      }
    });
    this.wQV.a(new MMSlideDelView.e()
    {
      public final void aV(Object paramAnonymousObject)
      {
        GMTrace.i(1757715365888L, 13096);
        if (paramAnonymousObject == null)
        {
          w.e("MicroMsg.ChatroomContactUI", "onItemDel object null");
          GMTrace.o(1757715365888L, 13096);
          return;
        }
        ChatroomContactUI.Ww(paramAnonymousObject.toString());
        ChatroomContactUI.c(ChatroomContactUI.this);
        GMTrace.o(1757715365888L, 13096);
      }
    });
    this.mvH.setOnScrollListener(this.jNJ);
    this.wQV.txr = this.jNJ;
    this.juL = new com.tencent.mm.ui.widget.h(this.vKB.vKW);
    this.mvH.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1780129726464L, 13263);
        paramAnonymousView = new StringBuilder("onItemClick ").append(paramAnonymousInt);
        if (ChatroomContactUI.d(ChatroomContactUI.this) == null) {}
        for (paramAnonymousAdapterView = ChatroomContactUI.d(ChatroomContactUI.this);; paramAnonymousAdapterView = Boolean.valueOf(ChatroomContactUI.d(ChatroomContactUI.this).xmZ))
        {
          w.d("MicroMsg.ChatroomContactUI", paramAnonymousAdapterView);
          if (paramAnonymousInt >= ChatroomContactUI.b(ChatroomContactUI.this).getHeaderViewsCount()) {
            break;
          }
          GMTrace.o(1780129726464L, 13263);
          return;
        }
        paramAnonymousInt -= ChatroomContactUI.b(ChatroomContactUI.this).getHeaderViewsCount();
        if ((ChatroomContactUI.d(ChatroomContactUI.this) != null) && (ChatroomContactUI.d(ChatroomContactUI.this).xmZ))
        {
          boolean bool1 = ChatroomContactUI.d(ChatroomContactUI.this).oR(paramAnonymousInt);
          boolean bool2 = ChatroomContactUI.d(ChatroomContactUI.this).Ed(paramAnonymousInt);
          w.d("MicroMsg.ChatroomContactUI", "onItemClick " + bool2);
          if (bool2)
          {
            paramAnonymousView = ChatroomContactUI.d(ChatroomContactUI.this);
            if (ChatroomContactUI.e(ChatroomContactUI.this) == null) {}
            for (paramAnonymousAdapterView = "";; paramAnonymousAdapterView = ChatroomContactUI.e(ChatroomContactUI.this).bFU())
            {
              paramAnonymousView.Xe(paramAnonymousAdapterView);
              GMTrace.o(1780129726464L, 13263);
              return;
            }
          }
          if (bool1)
          {
            paramAnonymousView = ChatroomContactUI.d(ChatroomContactUI.this).Ec(paramAnonymousInt);
            paramAnonymousAdapterView = paramAnonymousView.ufy.uNR;
            at.AR();
            Object localObject = c.yK().TE(paramAnonymousAdapterView);
            if (a.eE(((af)localObject).field_type))
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView);
              paramAnonymousView.putExtra("Contact_Scene", 3);
              if ((paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.length() > 0))
              {
                if (((x)localObject).bSA()) {
                  g.ork.A(10298, paramAnonymousAdapterView + ",3");
                }
                e.a(paramAnonymousView, paramAnonymousAdapterView);
                com.tencent.mm.bj.d.b(ChatroomContactUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
              }
              GMTrace.o(1780129726464L, 13263);
              return;
            }
            localObject = new Intent();
            ((Intent)localObject).putExtra("Contact_User", paramAnonymousView.ufy.uNR);
            ((Intent)localObject).putExtra("Contact_Alias", paramAnonymousView.gCC);
            ((Intent)localObject).putExtra("Contact_Nick", paramAnonymousView.uxT.uNR);
            ((Intent)localObject).putExtra("Contact_Signature", paramAnonymousView.gCA);
            ((Intent)localObject).putExtra("Contact_RegionCode", RegionCodeDecoder.ai(paramAnonymousView.gCG, paramAnonymousView.gCy, paramAnonymousView.gCz));
            ((Intent)localObject).putExtra("Contact_Sex", paramAnonymousView.gCx);
            ((Intent)localObject).putExtra("Contact_VUser_Info", paramAnonymousView.uAw);
            ((Intent)localObject).putExtra("Contact_VUser_Info_Flag", paramAnonymousView.uAv);
            ((Intent)localObject).putExtra("Contact_KWeibo_flag", paramAnonymousView.uAz);
            ((Intent)localObject).putExtra("Contact_KWeibo", paramAnonymousView.uAx);
            ((Intent)localObject).putExtra("Contact_KWeiboNick", paramAnonymousView.uAy);
            ((Intent)localObject).putExtra("Contact_KSnsIFlag", paramAnonymousView.uAB.gCI);
            ((Intent)localObject).putExtra("Contact_KSnsBgId", paramAnonymousView.uAB.gCK);
            ((Intent)localObject).putExtra("Contact_KSnsBgUrl", paramAnonymousView.uAB.gCJ);
            if (paramAnonymousView.uAC != null) {}
            try
            {
              ((Intent)localObject).putExtra("Contact_customInfo", paramAnonymousView.uAC.toByteArray());
              if ((paramAnonymousView.uAv & 0x8) > 0) {
                g.ork.A(10298, paramAnonymousAdapterView + ",3");
              }
              com.tencent.mm.bj.d.b(ChatroomContactUI.this, "profile", ".ui.ContactInfoUI", (Intent)localObject);
              GMTrace.o(1780129726464L, 13263);
              return;
            }
            catch (IOException localIOException)
            {
              for (;;)
              {
                w.printErrStackTrace("MicroMsg.ChatroomContactUI", localIOException, "", new Object[0]);
              }
            }
          }
          paramAnonymousAdapterView = ChatroomContactUI.d(ChatroomContactUI.this).me(paramAnonymousInt);
          if (paramAnonymousAdapterView == null)
          {
            w.e("MicroMsg.ChatroomContactUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", new Object[] { Integer.valueOf(ChatroomContactUI.d(ChatroomContactUI.this).getCount()), Integer.valueOf(paramAnonymousInt) });
            GMTrace.o(1780129726464L, 13263);
            return;
          }
          u.k(ChatroomContactUI.e(ChatroomContactUI.this).bFU(), 9, 3, paramAnonymousInt + 1);
          paramAnonymousAdapterView = paramAnonymousAdapterView.field_username;
          paramAnonymousView = new Intent(ChatroomContactUI.this.vKB.vKW, En_5b8fbb1e.class);
          paramAnonymousView.addFlags(67108864);
          paramAnonymousView.putExtra("Chat_User", paramAnonymousAdapterView);
          paramAnonymousView.putExtra("Chat_Mode", 1);
          ChatroomContactUI.this.vKB.vKW.startActivity(paramAnonymousView);
          GMTrace.o(1780129726464L, 13263);
          return;
        }
        paramAnonymousAdapterView = ((x)ChatroomContactUI.f(ChatroomContactUI.this).getItem(paramAnonymousInt)).field_username;
        ChatroomContactUI.b(ChatroomContactUI.this, paramAnonymousAdapterView);
        GMTrace.o(1780129726464L, 13263);
      }
    });
    this.mvH.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1752615092224L, 13058);
        w.d("MicroMsg.ChatroomContactUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + paramAnonymousInt);
        if (paramAnonymousInt < ChatroomContactUI.b(ChatroomContactUI.this).getHeaderViewsCount())
        {
          w.w("MicroMsg.ChatroomContactUI", "on item long click, but match header view");
          GMTrace.o(1752615092224L, 13058);
          return true;
        }
        if ((ChatroomContactUI.d(ChatroomContactUI.this) != null) && (ChatroomContactUI.d(ChatroomContactUI.this).xmZ))
        {
          GMTrace.o(1752615092224L, 13058);
          return true;
        }
        paramAnonymousAdapterView = ((x)ChatroomContactUI.f(ChatroomContactUI.this).getItem(paramAnonymousInt - ChatroomContactUI.b(ChatroomContactUI.this).getHeaderViewsCount())).field_username;
        if ((com.tencent.mm.y.s.gc(paramAnonymousAdapterView)) || (com.tencent.mm.y.s.gd(paramAnonymousAdapterView)))
        {
          GMTrace.o(1752615092224L, 13058);
          return true;
        }
        ChatroomContactUI.c(ChatroomContactUI.this, paramAnonymousAdapterView);
        ChatroomContactUI.j(ChatroomContactUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, ChatroomContactUI.this, ChatroomContactUI.g(ChatroomContactUI.this), ChatroomContactUI.h(ChatroomContactUI.this), ChatroomContactUI.i(ChatroomContactUI.this));
        GMTrace.o(1752615092224L, 13058);
        return true;
      }
    });
    this.mvH.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1839319744512L, 13704);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          if (ChatroomContactUI.f(ChatroomContactUI.this) != null)
          {
            paramAnonymousView = ChatroomContactUI.f(ChatroomContactUI.this);
            if (paramAnonymousView.gCY != null) {
              paramAnonymousView.gCY.onTouchEvent(paramAnonymousMotionEvent);
            }
          }
          if (ChatroomContactUI.d(ChatroomContactUI.this) != null)
          {
            paramAnonymousView = ChatroomContactUI.d(ChatroomContactUI.this);
            if (paramAnonymousView.gCY != null) {
              paramAnonymousView.gCY.onTouchEvent(paramAnonymousMotionEvent);
            }
          }
          GMTrace.o(1839319744512L, 13704);
          return false;
          ChatroomContactUI.this.aLo();
          ChatroomContactUI.a(ChatroomContactUI.this, (int)paramAnonymousMotionEvent.getRawX());
          ChatroomContactUI.b(ChatroomContactUI.this, (int)paramAnonymousMotionEvent.getRawY());
        }
      }
    });
    Object localObject = this.mvH;
    ContactCountView localContactCountView = new ContactCountView(this);
    this.wPZ = localContactCountView;
    ((ListView)localObject).addFooterView(localContactCountView, null, false);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1804288917504L, 13443);
        ChatroomContactUI.this.finish();
        GMTrace.o(1804288917504L, 13443);
        return false;
      }
    });
    a(0, R.l.cQl, R.k.cIG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1752883527680L, 13060);
        paramAnonymousMenuItem = new Intent(ChatroomContactUI.this, SelectContactUI.class);
        paramAnonymousMenuItem.putExtra("titile", ChatroomContactUI.this.getString(R.l.cRo));
        paramAnonymousMenuItem.putExtra("list_type", 0);
        paramAnonymousMenuItem.putExtra("list_attr", s.q(new int[] { s.wTl, 256, 512 }));
        ChatroomContactUI.this.vKB.vKW.startActivity(paramAnonymousMenuItem);
        GMTrace.o(1752883527680L, 13060);
        return false;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1842675187712L, 13729);
        BackwardSupportUtil.c.a(ChatroomContactUI.b(ChatroomContactUI.this));
        GMTrace.o(1842675187712L, 13729);
      }
    };
    this.mvH.setAdapter(this.wQV);
    this.wPM.mH(false);
    this.mvH.setVisibility(0);
    this.vIF = new VoiceSearchLayout(this);
    localObject = new RelativeLayout.LayoutParams(-1, -1);
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    this.vIF.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.vIF.ze(BackwardSupportUtil.b.a(this, 100.0F));
    this.vIF.setVisibility(8);
    ((ViewGroup)findViewById(R.h.cmf)).addView(this.vIF);
    if (this.vIF != null) {
      this.vIF.twa = new VoiceSearchLayout.b()
      {
        public final void ke(boolean paramAnonymousBoolean)
        {
          GMTrace.i(1707249500160L, 12720);
          w.d("MicroMsg.ChatroomContactUI", "visible " + paramAnonymousBoolean);
          if (paramAnonymousBoolean)
          {
            int i = ChatroomContactUI.b(ChatroomContactUI.this).getFirstVisiblePosition();
            w.d("MicroMsg.ChatroomContactUI", "getFirstVisiblePosition  " + i);
            if (i > 0) {
              ChatroomContactUI.b(ChatroomContactUI.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(1746709512192L, 13014);
                  ChatroomContactUI.b(ChatroomContactUI.this).setSelection(0);
                  GMTrace.o(1746709512192L, 13014);
                }
              });
            }
          }
          GMTrace.o(1707249500160L, 12720);
        }
      };
    }
    if (this.wQV.getCount() == 0)
    {
      this.ldw.setSingleLine(false);
      this.ldw.setPadding(40, 0, 40, 0);
      this.ldw.setVisibility(0);
    }
    GMTrace.o(1808047013888L, 13471);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1808718102528L, 13476);
    if (!t.bx(this))
    {
      GMTrace.o(1808718102528L, 13476);
      return;
    }
    if (t.a.a(this, paramInt1, paramInt2, paramString, 4))
    {
      GMTrace.o(1808718102528L, 13476);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      GMTrace.o(1808718102528L, 13476);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(1808718102528L, 13476);
      return;
      aJY();
    }
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(1808852320256L, 13477);
    if (this.wPZ != null)
    {
      this.wPZ.wQY = 2;
      this.wPZ.cgl();
    }
    GMTrace.o(1808852320256L, 13477);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1807644360704L, 13468);
    int i = R.i.crI;
    GMTrace.o(1807644360704L, 13468);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1807778578432L, 13469);
    super.onCreate(paramBundle);
    oM(R.l.cQO);
    MP();
    at.wS().a(138, this);
    at.AR();
    c.yK().a(this.wQV);
    GMTrace.o(1807778578432L, 13469);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(1807912796160L, 13470);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    at.AR();
    if (c.yK().TE(this.wPO) == null)
    {
      w.e("MicroMsg.ChatroomContactUI", "onCreateContextMenu, contact is null, username = " + this.wPO);
      GMTrace.o(1807912796160L, 13470);
      return;
    }
    if (com.tencent.mm.y.s.fA(this.wPO))
    {
      paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(paramView.getContext(), r.fs(this.wPO)));
      paramContextMenu.add(paramContextMenuInfo.position, 1, 0, R.l.cQS);
      GMTrace.o(1807912796160L, 13470);
      return;
    }
    GMTrace.o(1807912796160L, 13470);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1808449667072L, 13474);
    super.onDestroy();
    at.wS().b(138, this);
    at.AR();
    c.yK().b(this.wQV);
    d locald = this.wQV;
    if (locald.gCY != null)
    {
      locald.gCY.detach();
      locald.gCY = null;
    }
    this.wQV.aJe();
    this.wQV.vKu = null;
    this.wPM.detach();
    this.wPM.aJe();
    GMTrace.o(1808449667072L, 13474);
  }
  
  protected void onPause()
  {
    GMTrace.i(1808315449344L, 13473);
    super.onPause();
    at.AR();
    c.yT().j(this);
    if (this.wQU != null)
    {
      com.tencent.mm.pluginsdk.ui.tools.p localp = this.wQU;
      localp.cit();
      localp.cancel();
    }
    if (this.wPM != null) {
      this.wPM.onPause();
    }
    GMTrace.o(1808315449344L, 13473);
  }
  
  protected void onResume()
  {
    GMTrace.i(1808181231616L, 13472);
    super.onResume();
    if (this.wPZ != null)
    {
      this.wPZ.wQY = 2;
      this.wPZ.cgl();
    }
    at.AR();
    c.yT().c(this);
    if ((this.wQU != null) && (this.vIF != null))
    {
      com.tencent.mm.bj.d.bNA();
      if ((com.tencent.mm.ap.b.Jw()) || (!v.bPK().equals("zh_CN"))) {
        break label127;
      }
      this.wQU.tHZ = true;
      this.wQU.o(this.vIF);
    }
    for (;;)
    {
      if (this.wPM != null) {
        this.wPM.onResume();
      }
      GMTrace.o(1808181231616L, 13472);
      return;
      label127:
      this.wQU.tHZ = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\ChatroomContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */