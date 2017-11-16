package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.fts.d.f.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import java.util.List;
import java.util.regex.Pattern;

public final class k
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public i hWl;
  public List<String> hWm;
  public x iBi;
  public CharSequence jvL;
  public CharSequence jvM;
  public CharSequence oEG;
  private b oEH;
  a oEI;
  public String username;
  
  public k(int paramInt)
  {
    super(2, paramInt);
    GMTrace.i(11844848713728L, 88251);
    this.oEH = new b();
    this.oEI = new a();
    GMTrace.o(11844848713728L, 88251);
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vu()
  {
    GMTrace.i(16474152370176L, 122742);
    b localb = this.oEH;
    GMTrace.o(16474152370176L, 122742);
    return localb;
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18367159205888L, 136846);
    a locala = this.oEI;
    GMTrace.o(18367159205888L, 136846);
    return locala;
  }
  
  public final int Vx()
  {
    GMTrace.i(11845251366912L, 88254);
    int i = this.hWl.lxn;
    GMTrace.o(11845251366912L, 88254);
    return i;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16474018152448L, 122741);
    this.username = this.hWl.lwH;
    at.AR();
    this.iBi = c.yK().TE(this.username);
    paramVarArgs = this.hWm;
    Object localObject2 = paramContext.getResources();
    parama = this.iBi;
    Object localObject1 = r.a(parama, parama.field_username);
    boolean bool2;
    int i;
    switch (this.hWl.gRk)
    {
    default: 
      bool2 = false;
      i = 0;
      parama = null;
      bool1 = false;
      if (i != 0)
      {
        this.jvL = h.c(paramContext, (CharSequence)localObject1, d.b.lzt);
        this.jvL = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvL, this.eQb, paramVarArgs, bool1, bool2, f.a.lzA, d.b.lzu)).lAJ;
        this.jvM = parama;
        GMTrace.o(16474018152448L, 122741);
        return;
      }
      break;
    case 3: 
    case 7: 
      label151:
      label202:
      bool2 = true;
    }
    label219:
    for (boolean bool1 = true;; bool1 = false)
    {
      this.jvM = parama.field_nickname;
      parama = null;
      i = 1;
      break label151;
      at.AR();
      Cursor localCursor = c.yH().a("SELECT memberlist FROM chatroom WHERE chatroomname=?;", new String[] { parama.field_username }, 2);
      if (localCursor.moveToFirst())
      {
        parama = localCursor.getString(0);
        if (parama == null) {
          parama = null;
        }
      }
      for (;;)
      {
        localCursor.close();
        if ((parama != null) && (parama.length > 0)) {
          this.oEG = ("(" + parama.length + ")");
        }
        if ((parama == null) || (this.hWl.lxl == null)) {
          break;
        }
        parama = e.a(paramContext, this.hWl.lxl, parama, paramVarArgs, d.b.lzw, this.eQb);
        parama = TextUtils.concat(new CharSequence[] { ((Resources)localObject2).getString(R.l.dWg), parama });
        bool2 = false;
        i = 0;
        bool1 = false;
        break label151;
        parama = c.a.lwq.split(parama);
        continue;
        this.jvL = h.c(paramContext, (CharSequence)localObject1, d.b.lzt);
        paramContext = this.jvL;
        paramVarArgs = this.oEG;
        float f = f.a.lzA;
        localObject1 = d.b.lzu;
        localObject2 = TextUtils.TruncateAt.END;
        this.jvL = TextUtils.concat(new CharSequence[] { TextUtils.ellipsize(paramContext, (TextPaint)localObject1, f - ((TextPaint)localObject1).measureText(paramVarArgs.toString()), (TextUtils.TruncateAt)localObject2), paramVarArgs });
        break label202;
        parama = null;
      }
      bool2 = false;
      break label219;
      bool2 = false;
    }
  }
  
  public final int aCG()
  {
    GMTrace.i(11845385584640L, 88255);
    if (this.hWl.gRk == 38)
    {
      List localList = this.hWl.lxl;
      if ((localList != null) && (localList.size() > 0))
      {
        i = ((d)localList.get(0)).gRk;
        GMTrace.o(11845385584640L, 88255);
        return i;
      }
    }
    int i = super.aCG();
    GMTrace.o(11845385584640L, 88255);
    return i;
  }
  
  public final boolean aCH()
  {
    GMTrace.i(11845519802368L, 88256);
    boolean bool = this.hWl.lxo;
    GMTrace.o(11845519802368L, 88256);
    return bool;
  }
  
  public final class a
    extends a.a
  {
    public View hqF;
    public ImageView hqG;
    public TextView hqH;
    public TextView hqI;
    
    public a()
    {
      super();
      GMTrace.i(11850485858304L, 88293);
      GMTrace.o(11850485858304L, 88293);
    }
  }
  
  public final class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(11850888511488L, 88296);
      GMTrace.o(11850888511488L, 88296);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11851022729216L, 88297);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxG, paramViewGroup, false);
      paramViewGroup = (k.a)k.this.oEI;
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(R.h.chT));
      paramViewGroup.hqI = ((TextView)paramContext.findViewById(R.h.bti));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11851022729216L, 88297);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16469991620608L, 122711);
      parama = (k.a)parama;
      paramVarArgs = (k)paramVarArgs;
      ck(parama.hqF);
      if ((paramVarArgs.username != null) && (paramVarArgs.username.length() > 0)) {
        com.tencent.mm.pluginsdk.ui.a.b.a(parama.hqG, paramVarArgs.username);
      }
      for (;;)
      {
        parama.hqH.setText(paramVarArgs.jvL);
        parama.hqH.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(paramContext, 200));
        e.a(paramVarArgs.jvM, parama.hqI);
        GMTrace.o(16469991620608L, 122711);
        return;
        parama.hqG.setImageResource(R.g.aVS);
      }
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16470125838336L, 122712);
      paramVarArgs = (k)paramVarArgs;
      a(k.this.eQb, paramVarArgs.hWl);
      paramVarArgs = new Intent().putExtra("Chat_User", paramVarArgs.username).putExtra("finish_direct", true);
      com.tencent.mm.plugin.search.a.hnH.e(paramVarArgs, paramContext);
      GMTrace.o(16470125838336L, 122712);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */