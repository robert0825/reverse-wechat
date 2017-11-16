package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.fts.d.f.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;

public final class l
  extends b
{
  private a oEK;
  
  public l(int paramInt)
  {
    super(paramInt);
    GMTrace.i(11851425382400L, 88300);
    this.oEK = new a();
    GMTrace.o(11851425382400L, 88300);
  }
  
  public final a.b Vu()
  {
    GMTrace.i(16474555023360L, 122745);
    a locala = this.oEK;
    GMTrace.o(16474555023360L, 122745);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16474420805632L, 122744);
    this.username = this.hWl.lwH;
    at.AR();
    this.iBi = c.yK().TE(this.username);
    boolean bool6 = false;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool1 = false;
    String str = r.fs(this.username);
    int j;
    int i;
    switch (this.hWl.gRk)
    {
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
    case 14: 
    default: 
      bool1 = false;
      j = 0;
      parama = null;
      paramVarArgs = null;
      bool2 = false;
      i = 0;
    case 3: 
    case 2: 
    case 1: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 15: 
    case 16: 
      for (;;)
      {
        if (i != 0)
        {
          this.jvL = h.c(paramContext, str, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
          this.jvL = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvL, this.eQb, this.hWm, bool1, bool2, f.a.lzA, d.b.lzu)).lAJ;
          label234:
          if (j != 0)
          {
            this.jvM = h.c(paramContext, parama, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
            this.jvM = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvM, this.eQb, this.hWm, bool1, bool2, f.a.lzA, d.b.lzw)).lAJ;
            this.jvM = TextUtils.concat(new CharSequence[] { paramVarArgs, this.jvM });
          }
          GMTrace.o(16474420805632L, 122744);
          return;
          bool1 = true;
          bool3 = true;
          bool2 = bool1;
          j = 0;
          parama = null;
          paramVarArgs = null;
          i = 1;
          bool1 = bool3;
          continue;
          bool4 = true;
          bool6 = true;
          bool5 = bool4;
          parama = this.iBi.field_nickname;
          paramVarArgs = paramContext.getString(R.l.dWi);
          j = 1;
          bool1 = bool6;
          bool2 = bool5;
          i = 0;
          continue;
          parama = this.iBi.fjt;
          paramVarArgs = paramContext.getString(R.l.dWf);
          j = 1;
          bool1 = false;
          bool2 = false;
          i = 0;
          continue;
          paramVarArgs = this.iBi.qQ();
          parama = paramVarArgs;
          if (bg.nm(paramVarArgs)) {
            parama = this.iBi.field_username;
          }
          paramVarArgs = paramContext.getString(R.l.dWm);
          j = 1;
          bool1 = false;
          bool2 = false;
          i = 0;
          continue;
          parama = this.hWl.content;
          if (bg.nm(parama)) {
            break label673;
          }
          String[] arrayOfString = parama.split("​");
          j = arrayOfString.length;
          i = 0;
          label502:
          if (i >= j) {
            break label673;
          }
          paramVarArgs = arrayOfString[i];
          if (paramVarArgs.startsWith(this.eQb)) {
            parama = paramVarArgs;
          }
        }
      }
    }
    label673:
    for (;;)
    {
      paramVarArgs = paramContext.getString(R.l.dWh);
      j = 1;
      bool1 = false;
      bool2 = false;
      i = 0;
      break;
      i += 1;
      break label502;
      parama = this.hWl.content;
      paramVarArgs = paramContext.getString(R.l.dWj);
      j = 1;
      bool1 = false;
      bool2 = false;
      i = 0;
      break;
      parama = this.hWl.content;
      paramVarArgs = paramContext.getString(R.l.dWe);
      j = 1;
      bool1 = false;
      bool2 = false;
      i = 0;
      break;
      parama = this.hWl.lxi;
      paramVarArgs = paramContext.getString(R.l.dWl);
      j = 1;
      bool1 = false;
      bool2 = false;
      i = 0;
      break;
      this.jvL = h.c(paramContext, str, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
      break label234;
    }
  }
  
  public final class a
    extends b.b
  {
    public a()
    {
      super();
      GMTrace.i(11853841301504L, 88318);
      GMTrace.o(11853841301504L, 88318);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16471065362432L, 122719);
      paramVarArgs = (l)paramVarArgs;
      a(l.this.eQb, paramVarArgs.hWl);
      d.a(paramContext, ".ui.chatting.En_5b8fbb1e", new Intent().putExtra("Chat_User", paramVarArgs.username).putExtra("finish_direct", true));
      GMTrace.o(16471065362432L, 122719);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */