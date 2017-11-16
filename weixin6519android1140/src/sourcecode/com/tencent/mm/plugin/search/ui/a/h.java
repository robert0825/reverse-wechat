package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.k;
import com.tencent.mm.modelfriend.l;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.friend.InviteFriendUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class h
  extends b
{
  public boolean oEt;
  public ad oEw;
  private a oEx;
  
  public h(int paramInt)
  {
    super(paramInt);
    GMTrace.i(11853170212864L, 88313);
    this.oEx = new a();
    GMTrace.o(11853170212864L, 88313);
  }
  
  public final a.b Vu()
  {
    GMTrace.i(16469857402880L, 122710);
    a locala = this.oEx;
    GMTrace.o(16469857402880L, 122710);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16469723185152L, 122709);
    this.username = this.hWl.lwH;
    at.AR();
    this.iBi = c.yK().TE(this.username);
    this.oEw = af.Ik().am(this.hWl.lxe);
    boolean bool6 = false;
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool7 = false;
    String str = this.oEw.getDisplayName();
    int j = 0;
    int i = j;
    if (this.oEw.Ia() != null)
    {
      i = j;
      if (this.oEw.Ia().length() > 0) {
        i = 1;
      }
    }
    switch (this.hWl.gRk)
    {
    default: 
      bool1 = false;
      i = 0;
      j = 0;
      parama = null;
      paramVarArgs = null;
      bool2 = bool7;
      if (j != 0) {
        this.jvL = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, str, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
      }
      break;
    }
    for (this.jvL = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvL, this.eQb, this.hWm, bool1, bool2)).lAJ;; this.jvL = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, str, com.tencent.mm.br.a.V(paramContext, R.f.aQF)))
    {
      if (i != 0)
      {
        this.jvM = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, parama, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
        this.jvM = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvM, this.eQb, this.hWm, bool1, bool2)).lAJ;
        this.jvM = TextUtils.concat(new CharSequence[] { paramVarArgs, this.jvM });
      }
      GMTrace.o(16469723185152L, 122709);
      return;
      bool1 = true;
      bool3 = true;
      bool2 = bool1;
      if (i != 0) {}
      int k;
      for (i = 0;; i = 1)
      {
        parama = this.oEw.gDV;
        paramVarArgs = paramContext.getString(R.l.dWk);
        k = 0;
        j = i;
        bool1 = bool3;
        i = k;
        break;
      }
      parama = this.oEw.gDV;
      paramVarArgs = paramContext.getString(R.l.dWk);
      i = 1;
      bool1 = false;
      j = 0;
      bool2 = bool7;
      break;
      bool4 = true;
      bool6 = true;
      bool5 = bool4;
      if (i != 0) {}
      for (i = 0;; i = 1)
      {
        parama = this.oEw.gDV;
        paramVarArgs = paramContext.getString(R.l.dWk);
        k = 0;
        j = i;
        bool1 = bool6;
        bool2 = bool5;
        i = k;
        break;
      }
    }
  }
  
  public final class a
    extends b.b
  {
    public a()
    {
      super();
      GMTrace.i(11845922455552L, 88259);
      GMTrace.o(11845922455552L, 88259);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16472810192896L, 122732);
      paramVarArgs = (h)paramVarArgs;
      if (paramVarArgs.oEw == null)
      {
        GMTrace.o(16472810192896L, 122732);
        return true;
      }
      if ((paramVarArgs.oEw.gDW == 1) || (paramVarArgs.oEw.gDW == 2))
      {
        paramVarArgs = new Intent();
        paramVarArgs.putExtra("Contact_User", h.this.oEw.getUsername());
        paramVarArgs.putExtra("Contact_Nick", h.this.oEw.HW());
        paramVarArgs.putExtra("Contact_Uin", h.this.oEw.gDV);
        paramVarArgs.putExtra("Contact_QQNick", h.this.oEw.getDisplayName());
        paramVarArgs.putExtra("Contact_Scene", 12);
        paramVarArgs.putExtra("Contact_RemarkName", h.this.oEw.Ia());
        k localk = af.Ih().jQ(h.this.oEw.getUsername());
        if (localk != null) {
          paramVarArgs.putExtra("Contact_Sex", localk.fja);
        }
        if (h.this.oEt) {
          paramVarArgs.putExtra("add_more_friend_search_scene", 1);
        }
        paramVarArgs.putExtra("Contact_ShowUserName", false);
        com.tencent.mm.plugin.c.a.hnH.d(paramVarArgs, paramContext);
        GMTrace.o(16472810192896L, 122732);
        return true;
      }
      if (h.this.oEw.gDW == 0)
      {
        paramVarArgs = new Intent(paramContext, InviteFriendUI.class);
        paramVarArgs.putExtra("friend_type", 0);
        paramVarArgs.putExtra("friend_user_name", h.this.oEw.getUsername());
        paramVarArgs.putExtra("friend_num", h.this.oEw.gDV);
        paramVarArgs.putExtra("friend_nick", h.this.oEw.getDisplayName());
        paramVarArgs.putExtra("friend_weixin_nick", h.this.oEw.HW());
        paramVarArgs.putExtra("friend_scene", 12);
        paramContext.startActivity(paramVarArgs);
        GMTrace.o(16472810192896L, 122732);
        return true;
      }
      GMTrace.o(16472810192896L, 122732);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */