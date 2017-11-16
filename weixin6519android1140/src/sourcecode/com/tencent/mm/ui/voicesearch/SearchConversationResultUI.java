package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
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
import com.tencent.mm.g.b.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.LinkedList;

public class SearchConversationResultUI
  extends MMActivity
{
  private TextView jUy;
  private String username;
  private ListView xmR;
  private a xmS;
  private String xmT;
  
  public SearchConversationResultUI()
  {
    GMTrace.i(2844073656320L, 21190);
    this.xmT = null;
    GMTrace.o(2844073656320L, 21190);
  }
  
  protected final void MP()
  {
    GMTrace.i(2844342091776L, 21192);
    this.xmR = ((ListView)findViewById(R.h.clW));
    this.jUy = ((TextView)findViewById(R.h.bwQ));
    this.xmS = new a(getApplicationContext(), new o.a()
    {
      public final void QC()
      {
        GMTrace.i(2848234405888L, 21221);
        GMTrace.o(2848234405888L, 21221);
      }
      
      public final void QD()
      {
        GMTrace.i(2848100188160L, 21220);
        GMTrace.o(2848100188160L, 21220);
      }
    });
    if (this.xmS != null) {
      this.xmS.cS(new LinkedList());
    }
    this.xmR.setAdapter(this.xmS);
    this.jUy.setVisibility(8);
    this.username = getIntent().getStringExtra("SearchConversationResult_User");
    this.xmT = getIntent().getStringExtra("SearchConversationResult_Error");
    sq(getString(R.l.cHB));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2845818486784L, 21203);
        SearchConversationResultUI.this.finish();
        GMTrace.o(2845818486784L, 21203);
        return true;
      }
    });
    this.xmR.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(2833202020352L, 21109);
        if (paramAnonymousInt < SearchConversationResultUI.a(SearchConversationResultUI.this).getHeaderViewsCount())
        {
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        paramAnonymousInt -= SearchConversationResultUI.a(SearchConversationResultUI.this).getHeaderViewsCount();
        paramAnonymousAdapterView = (ae)SearchConversationResultUI.b(SearchConversationResultUI.this).getItem(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          w.e("MicroMsg.VoiceSearchResultUI", "null user at position = " + paramAnonymousInt);
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        w.d("MicroMsg.VoiceSearchResultUI", "username " + paramAnonymousAdapterView.field_username);
        if (s.fI(paramAnonymousAdapterView.field_username))
        {
          if (q.zX())
          {
            paramAnonymousAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(SearchConversationResultUI.this.vKB.vKW, "tmessage", ".ui.TConversationUI", paramAnonymousAdapterView);
            GMTrace.o(2833202020352L, 21109);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.fK(paramAnonymousAdapterView.field_username))
        {
          if (q.zU())
          {
            paramAnonymousAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(SearchConversationResultUI.this.vKB.vKW, "qmessage", ".ui.QConversationUI", paramAnonymousAdapterView);
            GMTrace.o(2833202020352L, 21109);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.fJ(paramAnonymousAdapterView.field_username))
        {
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.fO(paramAnonymousAdapterView.field_username))
        {
          MMAppMgr.cancelNotification(paramAnonymousAdapterView.field_username);
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.fG(paramAnonymousAdapterView.field_username))
        {
          if (q.Ag())
          {
            SearchConversationResultUI.a(SearchConversationResultUI.this, En_5b8fbb1e.class, new Intent().putExtra("Chat_User", paramAnonymousAdapterView.field_username).putExtra("finish_direct", true));
            GMTrace.o(2833202020352L, 21109);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.fT(paramAnonymousAdapterView.field_username))
        {
          if (q.Ab())
          {
            paramAnonymousAdapterView = new Intent();
            paramAnonymousAdapterView.putExtra("type", 20);
            d.b(SearchConversationResultUI.this, "readerapp", ".ui.ReaderAppUI", paramAnonymousAdapterView);
            GMTrace.o(2833202020352L, 21109);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.gb(paramAnonymousAdapterView.field_username))
        {
          if (q.Ac())
          {
            paramAnonymousAdapterView = new Intent();
            paramAnonymousAdapterView.putExtra("type", 11);
            d.b(SearchConversationResultUI.this, "readerapp", ".ui.ReaderAppUI", paramAnonymousAdapterView);
            GMTrace.o(2833202020352L, 21109);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.fL(paramAnonymousAdapterView.field_username))
        {
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.fM(paramAnonymousAdapterView.field_username))
        {
          if (q.Ae())
          {
            paramAnonymousAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(SearchConversationResultUI.this, "masssend", ".ui.MassSendHistoryUI", paramAnonymousAdapterView);
            GMTrace.o(2833202020352L, 21109);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if (s.fS(paramAnonymousAdapterView.field_username))
        {
          if (q.zY())
          {
            SearchConversationResultUI.b(SearchConversationResultUI.this, En_5b8fbb1e.class, new Intent().putExtra("Chat_User", paramAnonymousAdapterView.field_username).putExtra("finish_direct", true));
            GMTrace.o(2833202020352L, 21109);
            return;
          }
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        if ((s.fQ(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (s.fR(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (s.fN(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (s.fU(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (s.fV(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (s.fH(SearchConversationResultUI.c(SearchConversationResultUI.this))) || (s.ge(SearchConversationResultUI.c(SearchConversationResultUI.this))))
        {
          d.b(SearchConversationResultUI.this, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAnonymousAdapterView.field_username));
          GMTrace.o(2833202020352L, 21109);
          return;
        }
        SearchConversationResultUI.c(SearchConversationResultUI.this, En_5b8fbb1e.class, new Intent().putExtra("Chat_User", paramAnonymousAdapterView.field_username).putExtra("finish_direct", true));
        GMTrace.o(2833202020352L, 21109);
      }
    });
    String str = this.username;
    this.jUy.setVisibility(8);
    if (this.xmS != null) {
      this.xmS.Au(str);
    }
    GMTrace.o(2844342091776L, 21192);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2844744744960L, 21195);
    int i = R.i.cHB;
    GMTrace.o(2844744744960L, 21195);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2844207874048L, 21191);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(2844207874048L, 21191);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2844476309504L, 21193);
    super.onDestroy();
    this.xmS.aJe();
    GMTrace.o(2844476309504L, 21193);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2844610527232L, 21194);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2844610527232L, 21194);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\voicesearch\SearchConversationResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */