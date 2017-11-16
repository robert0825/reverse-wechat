package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.contact.e;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bl;
import com.tencent.mm.y.bm;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VoiceSearchResultUI
  extends MMActivity
{
  private int gPO;
  private TextView jUy;
  private int kOy;
  int showType;
  private ListView xmR;
  private String xmT;
  private b xne;
  private String[] xnf;
  private boolean xng;
  boolean xnh;
  
  public VoiceSearchResultUI()
  {
    GMTrace.i(2839510253568L, 21156);
    this.xmT = null;
    this.kOy = -1;
    this.showType = 1;
    this.gPO = 2;
    this.xng = false;
    this.xnh = false;
    GMTrace.o(2839510253568L, 21156);
  }
  
  private static String[] I(String[] paramArrayOfString)
  {
    GMTrace.i(2839912906752L, 21159);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      GMTrace.o(2839912906752L, 21159);
      return paramArrayOfString;
    }
    w.d("MicroMsg.VoiceSearchResultUI", "oldlist.length " + paramArrayOfString.length);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str1 = paramArrayOfString[i];
      String str2 = r.fs(str1);
      w.d("MicroMsg.VoiceSearchResultUI", "displayname " + str2);
      if ((!localHashMap.containsValue(str2)) || (!s.eb(str1)))
      {
        w.d("MicroMsg.VoiceSearchResultUI", "username " + str1);
        localHashMap.put(str2, str1);
        localArrayList.add(str1);
      }
      i += 1;
    }
    paramArrayOfString = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    GMTrace.o(2839912906752L, 21159);
    return paramArrayOfString;
  }
  
  private void J(String[] paramArrayOfString)
  {
    GMTrace.i(2840583995392L, 21164);
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfString != null) && (this.xne != null))
    {
      int j = paramArrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = paramArrayOfString[i];
        if (this.xne.Xg(str)) {
          localArrayList.add(str);
        }
        i += 1;
      }
    }
    if (localArrayList.size() == 0)
    {
      this.jUy.setVisibility(0);
      if (this.xmT != null) {
        this.jUy.setText(this.xmT);
      }
    }
    for (;;)
    {
      if (this.xne != null) {
        this.xne.de(localArrayList);
      }
      GMTrace.o(2840583995392L, 21164);
      return;
      this.jUy.setText(getString(R.l.cQV));
      continue;
      this.jUy.setVisibility(8);
    }
  }
  
  static boolean Xh(String paramString)
  {
    GMTrace.i(2840449777664L, 21163);
    Cursor[] arrayOfCursor = new Cursor[2];
    arrayOfCursor[0] = at.AR().glP.a(s.gmw, null, paramString);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    try
    {
      while (arrayOfCursor[0].moveToNext())
      {
        String str = arrayOfCursor[0].getString(arrayOfCursor[0].getColumnIndex("username"));
        localArrayList1.add(str);
        if (!str.endsWith("@chatroom")) {
          localArrayList2.add(str);
        }
        w.d("MicroMsg.VoiceSearchResultUI", "block user " + str);
      }
      int i;
      int j;
      return false;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.VoiceSearchResultUI", localException, "", new Object[0]);
      arrayOfCursor[1] = at.AR().glQ.a(paramString, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
      i = arrayOfCursor[1].getCount();
      j = arrayOfCursor[0].getCount();
      arrayOfCursor[0].close();
      arrayOfCursor[1].close();
      w.d("MicroMsg.VoiceSearchResultUI", "contactCount " + i + " conversationCount " + j);
      if (i + j <= 1)
      {
        GMTrace.o(2840449777664L, 21163);
        return true;
      }
      GMTrace.o(2840449777664L, 21163);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(2839778689024L, 21158);
    this.xmR = ((ListView)findViewById(R.h.clW));
    this.jUy = ((TextView)findViewById(R.h.bwQ));
    this.xnf = getIntent().getStringArrayExtra("VoiceSearchResultUI_Resultlist");
    this.xmT = getIntent().getStringExtra("VoiceSearchResultUI_Error");
    this.kOy = getIntent().getIntExtra("VoiceSearchResultUI_VoiceId", -1);
    this.showType = getIntent().getIntExtra("VoiceSearchResultUI_ShowType", 1);
    int i;
    LinkedList localLinkedList;
    if (this.showType == 1)
    {
      i = 2;
      this.gPO = i;
      this.xnh = getIntent().getBooleanExtra("VoiceSearchResultUI_IsVoiceControl", false);
      w.i("MicroMsg.VoiceSearchResultUI", "showType = %s, isVoiceControl = %s", new Object[] { Integer.valueOf(this.showType), Boolean.valueOf(this.xnh) });
      this.xne = new b(getApplicationContext(), this.showType);
      this.xne.mI(false);
      localLinkedList = new LinkedList();
      switch (this.showType)
      {
      case 1: 
      default: 
        label220:
        if (this.xne != null) {
          this.xne.cS(localLinkedList);
        }
        this.xmR.setAdapter(this.xne);
        this.jUy.setVisibility(8);
        w.d("MicroMsg.VoiceSearchResultUI", "voiceId  " + this.kOy);
        if (this.showType == 2)
        {
          sq("");
          this.xnf = I(this.xnf);
        }
        break;
      }
    }
    for (;;)
    {
      sq(getString(R.l.cHB));
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2847831752704L, 21218);
          StringBuilder localStringBuilder;
          if (!VoiceSearchResultUI.a(VoiceSearchResultUI.this))
          {
            paramAnonymousMenuItem = g.ork;
            localStringBuilder = new StringBuilder().append(VoiceSearchResultUI.b(VoiceSearchResultUI.this)).append(",").append(VoiceSearchResultUI.c(VoiceSearchResultUI.this)).append(",");
            if (VoiceSearchResultUI.d(VoiceSearchResultUI.this) != null) {
              break label130;
            }
          }
          label130:
          for (int i = 0;; i = VoiceSearchResultUI.d(VoiceSearchResultUI.this).length)
          {
            paramAnonymousMenuItem.A(10452, i + ",0");
            if (VoiceSearchResultUI.e(VoiceSearchResultUI.this)) {
              VoiceSearchResultUI.this.moveTaskToBack(true);
            }
            VoiceSearchResultUI.this.finish();
            GMTrace.o(2847831752704L, 21218);
            return true;
          }
        }
      });
      this.xmR.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(2848905494528L, 21226);
          if (!VoiceSearchResultUI.a(VoiceSearchResultUI.this))
          {
            paramAnonymousAdapterView = g.ork;
            paramAnonymousView = new StringBuilder().append(VoiceSearchResultUI.b(VoiceSearchResultUI.this)).append(",").append(VoiceSearchResultUI.c(VoiceSearchResultUI.this)).append(",");
            if (VoiceSearchResultUI.d(VoiceSearchResultUI.this) != null) {
              break label151;
            }
          }
          Object localObject;
          label151:
          for (int i = 0;; i = VoiceSearchResultUI.d(VoiceSearchResultUI.this).length)
          {
            paramAnonymousAdapterView.A(10452, i + "," + paramAnonymousInt);
            localObject = VoiceSearchResultUI.f(VoiceSearchResultUI.this).me(paramAnonymousInt);
            paramAnonymousAdapterView = VoiceSearchResultUI.this;
            paramAnonymousView = ((af)localObject).field_username;
            localObject = ((x)localObject).vk();
            if ((paramAnonymousView != null) && (paramAnonymousView.length() > 0)) {
              break;
            }
            GMTrace.o(2848905494528L, 21226);
            return;
          }
          w.d("MicroMsg.VoiceSearchResultUI", "dealSelectContact " + paramAnonymousView);
          if (paramAnonymousAdapterView.showType == 3)
          {
            localObject = new Intent();
            ((Intent)localObject).putExtra("Select_Conv_User", paramAnonymousView);
            paramAnonymousAdapterView.setResult(-1, (Intent)localObject);
            paramAnonymousAdapterView.finish();
            GMTrace.o(2848905494528L, 21226);
            return;
          }
          if ((paramAnonymousAdapterView.showType == 1) || (s.gn(paramAnonymousView)) || (s.fD(paramAnonymousView)) || (s.eb(paramAnonymousView)) || (s.fA(paramAnonymousView)) || (VoiceSearchResultUI.Xh((String)localObject)))
          {
            if (paramAnonymousAdapterView.showType == 1)
            {
              localObject = new Intent();
              ((Intent)localObject).putExtra("Contact_User", paramAnonymousView);
              if (s.fA(paramAnonymousView)) {
                ((Intent)localObject).putExtra("Is_group_card", true);
              }
              if ((paramAnonymousView != null) && (paramAnonymousView.length() > 0))
              {
                e.a((Intent)localObject, paramAnonymousView);
                if (paramAnonymousAdapterView.xnh)
                {
                  paramAnonymousAdapterView.a(En_5b8fbb1e.class, new Intent().putExtra("Chat_User", paramAnonymousView).putExtra("finish_direct", true));
                  paramAnonymousAdapterView.finish();
                  GMTrace.o(2848905494528L, 21226);
                  return;
                }
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", (Intent)localObject);
              }
              GMTrace.o(2848905494528L, 21226);
              return;
            }
            if (paramAnonymousAdapterView.showType == 2)
            {
              if (bg.nm(paramAnonymousView))
              {
                w.e("MicroMsg.VoiceSearchResultUI", "username is null " + paramAnonymousView);
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fI(paramAnonymousView))
              {
                if (q.zX())
                {
                  paramAnonymousView = new Intent().putExtra("finish_direct", true);
                  d.b(paramAnonymousAdapterView.vKB.vKW, "tmessage", ".ui.TConversationUI", paramAnonymousView);
                  GMTrace.o(2848905494528L, 21226);
                  return;
                }
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fK(paramAnonymousView))
              {
                if (q.zU())
                {
                  paramAnonymousView = new Intent().putExtra("finish_direct", true);
                  d.b(paramAnonymousAdapterView.vKB.vKW, "qmessage", ".ui.QConversationUI", paramAnonymousView);
                  GMTrace.o(2848905494528L, 21226);
                  return;
                }
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fJ(paramAnonymousView))
              {
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fO(paramAnonymousView))
              {
                MMAppMgr.cancelNotification(paramAnonymousView);
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fG(paramAnonymousView))
              {
                if (q.Ag())
                {
                  paramAnonymousAdapterView.a(En_5b8fbb1e.class, new Intent().putExtra("Chat_User", paramAnonymousView).putExtra("finish_direct", true));
                  GMTrace.o(2848905494528L, 21226);
                  return;
                }
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fT(paramAnonymousView))
              {
                if (q.Ab())
                {
                  paramAnonymousView = new Intent();
                  paramAnonymousView.putExtra("type", 20);
                  d.b(paramAnonymousAdapterView, "readerapp", ".ui.ReaderAppUI", paramAnonymousView);
                  GMTrace.o(2848905494528L, 21226);
                  return;
                }
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.gb(paramAnonymousView))
              {
                if (q.Ac())
                {
                  paramAnonymousView = new Intent();
                  paramAnonymousView.putExtra("type", 11);
                  d.b(paramAnonymousAdapterView, "readerapp", ".ui.ReaderAppUI", paramAnonymousView);
                  GMTrace.o(2848905494528L, 21226);
                  return;
                }
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fL(paramAnonymousView))
              {
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fM(paramAnonymousView))
              {
                if (q.Ae())
                {
                  d.b(paramAnonymousAdapterView, "masssend", ".ui.MassSendHistoryUI", new Intent().putExtra("finish_direct", true));
                  GMTrace.o(2848905494528L, 21226);
                  return;
                }
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if (s.fS(paramAnonymousView))
              {
                if (q.zY())
                {
                  paramAnonymousAdapterView.a(En_5b8fbb1e.class, new Intent().putExtra("Chat_User", paramAnonymousView).putExtra("finish_direct", true));
                  GMTrace.o(2848905494528L, 21226);
                  return;
                }
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              if ((s.fQ(paramAnonymousView)) || (s.fR(paramAnonymousView)) || (s.fN(paramAnonymousView)) || (s.fU(paramAnonymousView)) || (s.fV(paramAnonymousView)) || (s.fH(paramAnonymousView)) || (s.ge(paramAnonymousView)))
              {
                d.b(paramAnonymousAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousView));
                GMTrace.o(2848905494528L, 21226);
                return;
              }
              paramAnonymousAdapterView.a(En_5b8fbb1e.class, new Intent().putExtra("Chat_User", paramAnonymousView).putExtra("finish_direct", true));
              GMTrace.o(2848905494528L, 21226);
            }
          }
          else
          {
            paramAnonymousView = new Intent(paramAnonymousAdapterView, SearchConversationResultUI.class);
            paramAnonymousView.putExtra("SearchConversationResult_User", (String)localObject);
            paramAnonymousAdapterView.startActivity(paramAnonymousView);
          }
          GMTrace.o(2848905494528L, 21226);
        }
      });
      J(this.xnf);
      GMTrace.o(2839778689024L, 21158);
      return;
      i = 1;
      break;
      localLinkedList.add("lbsapp");
      localLinkedList.add("shakeapp");
      localLinkedList.add("qqfriend");
      localLinkedList.add("facebookapp");
      localLinkedList.add("feedsapp");
      localLinkedList.add("fmessage");
      localLinkedList.add("voipapp");
      localLinkedList.add("voicevoipapp");
      localLinkedList.add("voiceinputapp");
      localLinkedList.add("linkedinplugin");
      localLinkedList.add("notifymessage");
      i = q.zP();
      if ((i & 0x1) != 0) {
        localLinkedList.add("qqmail");
      }
      if ((!s.Ar()) || ((i & 0x2) != 0)) {
        localLinkedList.add("tmessage");
      }
      if ((i & 0x20) != 0) {
        localLinkedList.add("qmessage");
      }
      if ((i & 0x80) != 0) {
        localLinkedList.add("qqsync");
      }
      if ((i & 0x10) != 0) {
        localLinkedList.add("medianote");
      }
      if ((0x80000 & i) != 0) {
        localLinkedList.add("newsapp");
      }
      if (((0x40000 & i) != 0) || (!s.Aq())) {
        localLinkedList.add("blogapp");
      }
      if ((0x10000 & i) != 0) {
        localLinkedList.add("masssendapp");
      }
      if ((i & 0x2000000) == 0) {
        break label220;
      }
      localLinkedList.add("voiceinputapp");
      break label220;
      sq(getString(R.l.cHB));
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2840718213120L, 21165);
    int i = R.i.cHB;
    GMTrace.o(2840718213120L, 21165);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2839644471296L, 21157);
    super.onCreate(paramBundle);
    MP();
    this.xng = false;
    GMTrace.o(2839644471296L, 21157);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2840047124480L, 21160);
    super.onDestroy();
    this.xne.aJe();
    GMTrace.o(2840047124480L, 21160);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2840315559936L, 21162);
    if (4 == paramInt)
    {
      g localg;
      StringBuilder localStringBuilder;
      if (!this.xng)
      {
        localg = g.ork;
        localStringBuilder = new StringBuilder().append(this.gPO).append(",").append(this.kOy).append(",");
        if (this.xnf != null) {
          break label121;
        }
      }
      label121:
      for (int i = 0;; i = this.xnf.length)
      {
        localg.A(10452, i + ",0");
        if (!this.xnh) {
          break;
        }
        moveTaskToBack(true);
        finish();
        GMTrace.o(2840315559936L, 21162);
        return true;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2840315559936L, 21162);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2840181342208L, 21161);
    super.onPause();
    this.xng = true;
    GMTrace.o(2840181342208L, 21161);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\voicesearch\VoiceSearchResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */