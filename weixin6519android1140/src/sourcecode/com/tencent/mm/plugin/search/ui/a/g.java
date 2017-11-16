package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.friend.InviteFriendUI;
import com.tencent.mm.y.at;

public final class g
  extends b
{
  public com.tencent.mm.modelfriend.b oEs;
  public boolean oEt;
  private a oEu;
  
  public g(int paramInt)
  {
    super(paramInt);
    GMTrace.i(11848741027840L, 88280);
    this.oEu = new a();
    GMTrace.o(11848741027840L, 88280);
  }
  
  public final a.b Vu()
  {
    GMTrace.i(16475226112000L, 122750);
    a locala = this.oEu;
    GMTrace.o(16475226112000L, 122750);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16475091894272L, 122749);
    this.username = this.hWl.lwH;
    at.AR();
    this.iBi = com.tencent.mm.y.c.yK().TE(this.username);
    this.oEs = af.If().al(this.hWl.lxe);
    Object localObject1 = null;
    Object localObject2 = null;
    int k = 0;
    int m = 0;
    boolean bool5 = false;
    boolean bool8 = false;
    boolean bool9 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool10 = false;
    String str = this.oEs.GU();
    boolean bool1 = bool10;
    boolean bool2 = bool9;
    int i = m;
    int j = k;
    parama = (a.a)localObject2;
    paramVarArgs = (Object[])localObject1;
    switch (this.hWl.gRk)
    {
    default: 
      paramVarArgs = (Object[])localObject1;
      parama = (a.a)localObject2;
      j = k;
      i = m;
      bool2 = bool9;
      bool1 = bool10;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 15: 
      if (j != 0) {
        this.jvL = h.c(paramContext, str, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
      }
      break;
    }
    for (this.jvL = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvL, this.eQb, this.hWm, bool2, bool1)).lAJ;; this.jvL = h.c(paramContext, str, com.tencent.mm.br.a.V(paramContext, R.f.aQF)))
    {
      if (i != 0)
      {
        this.jvM = h.c(paramContext, parama, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
        this.jvM = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvM, this.eQb, this.hWm, bool2, bool1)).lAJ;
        this.jvM = TextUtils.concat(new CharSequence[] { paramVarArgs, this.jvM });
      }
      GMTrace.o(16475091894272L, 122749);
      return;
      bool3 = true;
      bool5 = true;
      bool4 = bool3;
      j = 1;
      parama = this.oEs.Ha();
      paramVarArgs = paramContext.getString(R.l.dWh);
      bool1 = bool4;
      bool2 = bool5;
      i = m;
      break;
      i = 1;
      parama = this.oEs.Ha();
      paramVarArgs = paramContext.getString(R.l.dWh);
      bool1 = bool10;
      bool2 = bool9;
      j = k;
      break;
      bool6 = true;
      bool8 = true;
      bool7 = bool6;
      i = 1;
      parama = this.oEs.GX();
      paramVarArgs = paramContext.getString(R.l.dWn);
      bool1 = bool7;
      bool2 = bool8;
      j = k;
      break;
    }
  }
  
  public final class a
    extends b.b
  {
    public a()
    {
      super();
      GMTrace.i(11853572866048L, 88316);
      GMTrace.o(11853572866048L, 88316);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16474286587904L, 122743);
      paramVarArgs = (g)paramVarArgs;
      if (paramVarArgs.oEs == null)
      {
        GMTrace.o(16474286587904L, 122743);
        return true;
      }
      if ((paramVarArgs.oEs.status == 1) || (paramVarArgs.oEs.status == 2))
      {
        w.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin On Or Weixin Friend");
        paramVarArgs = new Intent();
        paramVarArgs.putExtra("Contact_User", g.this.oEs.getUsername());
        paramVarArgs.putExtra("Contact_Nick", g.this.oEs.GX());
        paramVarArgs.putExtra("Contact_Mobile_MD5", g.this.oEs.GS());
        paramVarArgs.putExtra("Contact_Alias", g.this.oEs.gCC);
        paramVarArgs.putExtra("Contact_Sex", g.this.oEs.gCx);
        paramVarArgs.putExtra("Contact_Signature", g.this.oEs.gCA);
        paramVarArgs.putExtra("Contact_RegionCode", RegionCodeDecoder.ai(g.this.oEs.gCG, g.this.oEs.gCy, g.this.oEs.gCz));
        paramVarArgs.putExtra("Contact_Scene", 13);
        paramVarArgs.putExtra("Contact_ShowUserName", false);
        if (g.this.oEt) {
          paramVarArgs.putExtra("add_more_friend_search_scene", 1);
        }
        com.tencent.mm.plugin.c.a.hnH.d(paramVarArgs, paramContext);
        GMTrace.o(16474286587904L, 122743);
        return true;
      }
      if (g.this.oEs.status == 0)
      {
        w.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin Off");
        paramVarArgs = new Intent(paramContext, InviteFriendUI.class);
        paramVarArgs.putExtra("friend_type", 1);
        paramVarArgs.putExtra("friend_user_name", g.this.oEs.getUsername());
        paramVarArgs.putExtra("friend_num", g.this.oEs.Ha());
        paramVarArgs.putExtra("friend_nick", g.this.oEs.GU());
        paramVarArgs.putExtra("friend_weixin_nick", g.this.oEs.GX());
        paramVarArgs.putExtra("friend_scene", 13);
        paramContext.startActivity(paramVarArgs);
        GMTrace.o(16474286587904L, 122743);
        return true;
      }
      w.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin status unknown");
      GMTrace.o(16474286587904L, 122743);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */