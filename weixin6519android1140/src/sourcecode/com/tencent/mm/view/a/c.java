package com.tencent.mm.view.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c.l;
import com.tencent.mm.bq.a.c;
import com.tencent.mm.g.a.cn;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.m.a.d;
import com.tencent.mm.plugin.m.a.e;
import com.tencent.mm.plugin.m.a.f;
import com.tencent.mm.plugin.m.a.g;
import com.tencent.mm.plugin.m.a.h;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.v;
import java.util.ArrayList;

public final class c
  extends a
{
  private l gLr;
  private com.tencent.mm.ao.a.c.d koF;
  ArrayList<EmojiInfo> kqB;
  private com.tencent.mm.ao.a.c.e xAj;
  
  public c(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    super(paramContext, parama);
    GMTrace.i(20109305315328L, 149826);
    this.xAj = new com.tencent.mm.ao.a.c.e()
    {
      public final void d(Object... paramAnonymousVarArgs)
      {
        GMTrace.i(20106352525312L, 149804);
        if ((paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0))
        {
          paramAnonymousVarArgs = paramAnonymousVarArgs[0];
          if ((paramAnonymousVarArgs != null) && ((paramAnonymousVarArgs instanceof EmojiInfo)))
          {
            cn localcn = new cn();
            localcn.eDQ.scene = 1;
            localcn.eDQ.eDR = ((EmojiInfo)paramAnonymousVarArgs);
            localcn.eDQ.context = c.this.mContext;
            com.tencent.mm.sdk.b.a.vgX.m(localcn);
          }
        }
        GMTrace.o(20106352525312L, 149804);
      }
    };
    this.koF = new com.tencent.mm.ao.a.c.d()
    {
      public final byte[] e(Object... paramAnonymousVarArgs)
      {
        GMTrace.i(20108634226688L, 149821);
        if ((paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0))
        {
          paramAnonymousVarArgs = paramAnonymousVarArgs[0];
          if ((paramAnonymousVarArgs != null) && ((paramAnonymousVarArgs instanceof EmojiInfo)))
          {
            paramAnonymousVarArgs = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().a((EmojiInfo)paramAnonymousVarArgs);
            GMTrace.o(20108634226688L, 149821);
            return paramAnonymousVarArgs;
          }
        }
        GMTrace.o(20108634226688L, 149821);
        return null;
      }
    };
    this.gLr = new l()
    {
      public final Bitmap C(byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(20109036879872L, 149824);
        paramAnonymousArrayOfByte = com.tencent.mm.plugin.gif.g.av(paramAnonymousArrayOfByte);
        GMTrace.o(20109036879872L, 149824);
        return paramAnonymousArrayOfByte;
      }
      
      public final Bitmap kv(String paramAnonymousString)
      {
        GMTrace.i(20109171097600L, 149825);
        paramAnonymousString = com.tencent.mm.plugin.gif.g.av(com.tencent.mm.a.e.c(paramAnonymousString, 0, com.tencent.mm.a.e.aY(paramAnonymousString)));
        GMTrace.o(20109171097600L, 149825);
        return paramAnonymousString;
      }
    };
    GMTrace.o(20109305315328L, 149826);
  }
  
  private EmojiInfo mK(int paramInt)
  {
    GMTrace.i(20109573750784L, 149828);
    int i = this.xAf * this.xAe + paramInt;
    paramInt = i;
    if (this.xze == 25)
    {
      paramInt = i;
      if (this.xzn.gRb != ChatFooterPanel.ttf) {
        paramInt = i - 1;
      }
    }
    if ((this.kqB == null) || (paramInt < 0) || (paramInt >= this.kqB.size()))
    {
      GMTrace.o(20109573750784L, 149828);
      return null;
    }
    EmojiInfo localEmojiInfo = (EmojiInfo)this.kqB.get(paramInt);
    GMTrace.o(20109573750784L, 149828);
    return localEmojiInfo;
  }
  
  public final int getCount()
  {
    GMTrace.i(20109439533056L, 149827);
    if (this.xAf == this.xzg - 1)
    {
      i = this.jtJ - this.xAf * this.xAe;
      if (i < 0)
      {
        GMTrace.o(20109439533056L, 149827);
        return 0;
      }
      GMTrace.o(20109439533056L, 149827);
      return i;
    }
    int i = this.xAe;
    GMTrace.o(20109439533056L, 149827);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20109707968512L, 149829);
    long l = paramInt;
    GMTrace.o(20109707968512L, 149829);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20109842186240L, 149830);
    Object localObject1;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = v.fb(this.mContext).inflate(a.f.kwr, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(this.xzn.getColumnWidth(), this.xzn.xCp));
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
      if ((this.xze != 25) || (this.xAf != 0) || (paramInt != 0) || (this.xzn.gRb == ChatFooterPanel.ttf)) {
        break label303;
      }
      ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a("", paramViewGroup.iub);
      paramViewGroup.iub.setBackgroundResource(a.d.kvR);
      paramViewGroup.iub.setImageResource(a.g.kww);
      paramViewGroup.iub.setContentDescription(paramView.getContext().getString(a.h.dYO));
      int i = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqF();
      com.tencent.mm.bq.a.bOv();
      localObject1 = com.tencent.mm.bq.a.vei;
      if (!((f)h.xv().wZ()).eR("")) {
        break label278;
      }
      paramInt = bg.getInt(com.tencent.mm.k.g.ut().getValue("CustomEmojiMaxSize"), 150);
      label233:
      if (i <= paramInt) {
        break label291;
      }
      paramViewGroup.xAl.setVisibility(0);
      paramViewGroup.xAl.setText(a.h.kwD);
    }
    for (;;)
    {
      GMTrace.o(20109842186240L, 149830);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label278:
      paramInt = ((a.c)localObject1).getInt("EmotionRecommandCount", 3);
      break label233;
      label291:
      paramViewGroup.xAl.setVisibility(8);
      continue;
      label303:
      paramViewGroup.xAl.setVisibility(8);
      localObject1 = mK(paramInt);
      if (localObject1 == null)
      {
        w.w("MicroMsg.smiley.EmojiSmileyAdapter", "emoji is null.");
        paramViewGroup.iub.setVisibility(8);
        paramViewGroup.hqI.setVisibility(8);
        ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a("", paramViewGroup.iub);
      }
      else
      {
        paramViewGroup.iub.setVisibility(0);
        Object localObject2 = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().vM(((EmojiInfo)localObject1).GS());
        if ((!bg.nm((String)localObject2)) && (this.xze == 23))
        {
          paramViewGroup.hqI.setText((CharSequence)localObject2);
          paramViewGroup.hqI.setVisibility(0);
        }
        Object localObject3;
        com.tencent.mm.ao.a.a.c.a locala;
        for (;;)
        {
          paramViewGroup.iub.setBackgroundResource(a.d.baz);
          if (this.xze != 25) {
            break label884;
          }
          if ((((EmojiInfo)localObject1).field_catalog != EmojiGroupInfo.vCm) && (((EmojiInfo)localObject1).field_catalog != EmojiInfo.vCt) && (((EmojiInfo)localObject1).field_catalog != EmojiInfo.vCs)) {
            break label676;
          }
          localObject1 = ((EmojiInfo)localObject1).getName();
          if (bg.nm((String)localObject1)) {
            break label664;
          }
          localObject1 = ((String)localObject1).replaceAll(".png", "");
          localObject2 = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ();
          localObject3 = paramViewGroup.iub;
          locala = new com.tencent.mm.ao.a.a.c.a();
          locala.gKH = 3;
          locala.gKV = a.d.baz;
          ((com.tencent.mm.ao.a.a)localObject2).a((String)localObject1, (ImageView)localObject3, locala.Jn());
          if (!((String)localObject1).equalsIgnoreCase("dice")) {
            break label633;
          }
          paramViewGroup.iub.setContentDescription(paramView.getContext().getString(a.h.kwB));
          break;
          paramViewGroup.hqI.setVisibility(8);
        }
        label633:
        if (((String)localObject1).equalsIgnoreCase("jsb"))
        {
          paramViewGroup.iub.setContentDescription(paramView.getContext().getString(a.h.kwC));
          continue;
          label664:
          w.i("MicroMsg.smiley.EmojiSmileyAdapter", "name is null");
          continue;
          label676:
          localObject2 = ((EmojiInfo)localObject1).bUU();
          localObject3 = (String)localObject2 + "_cover";
          locala = new com.tencent.mm.ao.a.a.c.a();
          locala.gKH = 1;
          locala.gKV = a.d.baz;
          locala.gKO = true;
          locala.eIy = ((String)localObject3);
          locala.gKE = ((String)localObject2);
          locala.gKP = true;
          locala.gLe = new Object[] { localObject1 };
          locala.gLd = true;
          localObject1 = locala.Jn();
          if (((f)h.xv().wZ()).eR(""))
          {
            ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a((String)localObject2, paramViewGroup.iub, (com.tencent.mm.ao.a.a.c)localObject1, this.xAj, this.koF, this.gLr);
          }
          else
          {
            ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a((String)localObject2, paramViewGroup.iub, (com.tencent.mm.ao.a.a.c)localObject1, null, this.koF, this.gLr);
            continue;
            label884:
            if (((EmojiInfo)localObject1).field_groupId.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.vCl)))
            {
              if (!bg.nm(((EmojiInfo)localObject1).getName()))
              {
                if (bg.nm(((EmojiInfo)localObject1).rc())) {}
                for (localObject1 = ((EmojiInfo)localObject1).getName();; localObject1 = ((EmojiInfo)localObject1).rc())
                {
                  localObject1 = ((String)localObject1).replaceAll(".png", "");
                  localObject2 = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ();
                  paramViewGroup = paramViewGroup.iub;
                  localObject3 = new com.tencent.mm.ao.a.a.c.a();
                  ((com.tencent.mm.ao.a.a.c.a)localObject3).gKH = 3;
                  ((com.tencent.mm.ao.a.a.c.a)localObject3).gKV = a.d.baz;
                  ((com.tencent.mm.ao.a.a)localObject2).a((String)localObject1, paramViewGroup, ((com.tencent.mm.ao.a.a.c.a)localObject3).Jn());
                  break;
                }
              }
              w.i("MicroMsg.smiley.EmojiSmileyAdapter", "name is null");
            }
            else
            {
              localObject2 = ((EmojiInfo)localObject1).bUU();
              localObject3 = (String)localObject2 + "_cover";
              locala = new com.tencent.mm.ao.a.a.c.a();
              locala.gKH = 1;
              locala.gKV = a.d.baz;
              locala.gKO = true;
              locala.eIy = ((String)localObject3);
              locala.gKE = ((String)localObject2);
              locala.gKP = true;
              locala.gLe = new Object[] { localObject1 };
              locala.gLd = true;
              localObject1 = locala.Jn();
              if (((f)h.xv().wZ()).eR("")) {
                ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a((String)localObject2, paramViewGroup.iub, (com.tencent.mm.ao.a.a.c)localObject1, this.xAj, this.koF, this.gLr);
              } else {
                ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a((String)localObject2, paramViewGroup.iub, (com.tencent.mm.ao.a.a.c)localObject1, null, this.koF, this.gLr);
              }
            }
          }
        }
      }
    }
  }
  
  final class a
  {
    TextView hqI;
    ImageView iub;
    TextView xAl;
    
    public a(View paramView)
    {
      GMTrace.i(20110110621696L, 149832);
      this.iub = ((ImageView)paramView.findViewById(a.e.beT));
      this.hqI = ((TextView)paramView.findViewById(a.e.kwc));
      this.xAl = ((TextView)paramView.findViewById(a.e.kwd));
      this.xAl.setTextSize(1, 12.0F);
      GMTrace.o(20110110621696L, 149832);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */