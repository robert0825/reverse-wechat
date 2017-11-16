package com.tencent.mm.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.m.a.d;
import com.tencent.mm.plugin.m.a.e;
import com.tencent.mm.plugin.m.a.f;
import com.tencent.mm.plugin.m.a.g;
import com.tencent.mm.plugin.m.a.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.io.File;
import java.util.ArrayList;

public final class e
  extends BaseAdapter
{
  public static final String kkd;
  private Context mContext;
  public ArrayList<EmojiGroupInfo> mData;
  com.tencent.mm.ao.a.a.c xAs;
  private com.tencent.mm.view.f.a xzl;
  
  static
  {
    GMTrace.i(20108365791232L, 149819);
    kkd = File.separator;
    GMTrace.o(20108365791232L, 149819);
  }
  
  public e(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    GMTrace.i(20107426267136L, 149812);
    this.mData = new ArrayList();
    this.xAs = null;
    this.mContext = paramContext;
    this.xzl = parama;
    paramContext = new c.a();
    paramContext.gKA = true;
    paramContext.gKH = 4;
    paramContext.gKV = a.d.kvS;
    paramContext.gKI = this.xzl.xCn;
    paramContext.gKI = this.xzl.xCn;
    this.xAs = paramContext.Jn();
    GMTrace.o(20107426267136L, 149812);
  }
  
  private static String F(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    GMTrace.i(20108097355776L, 149817);
    if ((bg.nm(paramString2)) && (bg.nm(paramString3)))
    {
      w.w("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "[cpan] get icon path failed. productid and url are null.");
      GMTrace.o(20108097355776L, 149817);
      return null;
    }
    if ((bg.nm(paramString2)) && (bg.nm(paramString3)))
    {
      w.e("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "[cpan] product id and url are null.");
      paramString3 = null;
      if (!bg.nm(paramString3)) {
        if (!bg.nm(paramString2)) {
          break label136;
        }
      }
    }
    label136:
    for (str = paramString1 + paramString3;; str = paramString1 + paramString2 + kkd + paramString3)
    {
      GMTrace.o(20108097355776L, 149817);
      return str;
      if (bg.nm(paramString3))
      {
        paramString3 = g.n(paramString2.getBytes());
        break;
      }
      paramString3 = g.n(paramString3.getBytes());
      break;
    }
  }
  
  public final EmojiGroupInfo EE(int paramInt)
  {
    GMTrace.i(20107694702592L, 149814);
    if ((this.mData == null) || (this.mData.isEmpty()) || (this.mData.size() < paramInt))
    {
      GMTrace.o(20107694702592L, 149814);
      return null;
    }
    EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)this.mData.get(paramInt);
    GMTrace.o(20107694702592L, 149814);
    return localEmojiGroupInfo;
  }
  
  public final int getCount()
  {
    GMTrace.i(20107560484864L, 149813);
    if (this.mData == null)
    {
      GMTrace.o(20107560484864L, 149813);
      return 0;
    }
    int i = this.mData.size();
    GMTrace.o(20107560484864L, 149813);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20107828920320L, 149815);
    long l = paramInt;
    GMTrace.o(20107828920320L, 149815);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20107963138048L, 149816);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(a.f.kwt, null);
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
    }
    EmojiGroupInfo localEmojiGroupInfo;
    for (;;)
    {
      localEmojiGroupInfo = EE(paramInt);
      if (localEmojiGroupInfo != null) {
        break;
      }
      paramViewGroup.eId.setVisibility(8);
      paramViewGroup.eId.setTag("");
      w.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "emoji group info is null. position:%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20107963138048L, 149816);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
    paramViewGroup.eId.setVisibility(0);
    if ("TAG_DEFAULT_TAB".equals(localEmojiGroupInfo.field_productID)) {
      if (((f)h.xv().wZ()).eR(""))
      {
        n.Jd().a(a.g.kwy, paramViewGroup.eId, this.xAs);
        paramViewGroup.eId.setContentDescription(this.mContext.getString(a.h.kwF));
        label203:
        paramViewGroup.eId.setBackgroundResource(a.d.kvS);
        paramViewGroup.eId.setPadding(this.xzl.xCo, this.xzl.xCo, this.xzl.xCo, this.xzl.xCo);
        if (paramInt != this.xzl.clt()) {
          break label1154;
        }
        paramViewGroup.eId.setSelected(true);
      }
    }
    for (;;)
    {
      GMTrace.o(20107963138048L, 149816);
      return paramView;
      ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a(a.g.kwy, paramViewGroup.eId, this.xAs);
      break;
      if (String.valueOf(EmojiGroupInfo.vCm).equals(localEmojiGroupInfo.field_productID))
      {
        if (((f)h.xv().wZ()).eR("")) {
          n.Jd().a(a.g.kwx, paramViewGroup.eId, this.xAs);
        }
        for (;;)
        {
          paramViewGroup.eId.setContentDescription(this.mContext.getString(a.h.kwH));
          break;
          ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a(a.g.kwx, paramViewGroup.eId, this.xAs);
        }
      }
      if (String.valueOf(EmojiGroupInfo.vCl).equals(localEmojiGroupInfo.field_productID))
      {
        if (((f)h.xv().wZ()).eR("")) {
          n.Jd().a(a.d.kvX, paramViewGroup.eId, this.xAs);
        }
        for (;;)
        {
          paramViewGroup.eId.setContentDescription(this.mContext.getString(a.h.dpp));
          break;
          ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a(a.d.kvX, paramViewGroup.eId, this.xAs);
        }
      }
      if ("TAG_STORE_MANEGER_TAB".equals(localEmojiGroupInfo.field_productID))
      {
        if (((f)h.xv().wZ()).eR("")) {
          n.Jd().a(a.g.kwz, paramViewGroup.eId, this.xAs);
        }
        for (;;)
        {
          paramViewGroup.eId.setContentDescription(this.mContext.getString(a.h.dYO));
          break;
          ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a(a.g.kwz, paramViewGroup.eId, this.xAs);
        }
      }
      String str;
      Object localObject;
      if (!com.tencent.mm.view.f.a.d(localEmojiGroupInfo))
      {
        str = localEmojiGroupInfo.field_packGrayIconUrl;
        localObject = F(((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().zo() + "emoji/", localEmojiGroupInfo.field_productID, str);
        c.a locala = new c.a();
        locala.gKE = ((String)localObject);
        locala.gKA = true;
        locala.gKC = true;
        locala.gKV = a.d.kvS;
        locala.gKL = true;
        locala.gKI = this.xzl.xCn;
        locala.gKI = this.xzl.xCn;
        localObject = locala.Jn();
        if (!bg.nm(str)) {
          ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a(str, paramViewGroup.eId, (com.tencent.mm.ao.a.a.c)localObject);
        }
      }
      for (;;)
      {
        if (!bg.nm(localEmojiGroupInfo.field_packName)) {
          break label1139;
        }
        paramViewGroup.eId.setContentDescription(this.mContext.getString(a.h.dpj));
        break;
        ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a("", paramViewGroup.eId, (com.tencent.mm.ao.a.a.c)localObject);
        w.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "empty url.");
        continue;
        str = F(new StringBuilder().append(((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().zo()).append("emoji/").toString(), localEmojiGroupInfo.field_productID, "") + "_panel_enable";
        localObject = new c.a();
        ((c.a)localObject).gKE = str;
        ((c.a)localObject).gKA = true;
        ((c.a)localObject).gKV = a.d.kvS;
        ((c.a)localObject).gKH = 1;
        ((c.a)localObject).gKI = this.xzl.xCn;
        ((c.a)localObject).gKI = this.xzl.xCn;
        localObject = ((c.a)localObject).Jn();
        ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqJ().a(str, paramViewGroup.eId, (com.tencent.mm.ao.a.a.c)localObject);
      }
      label1139:
      paramViewGroup.eId.setContentDescription(localEmojiGroupInfo.field_packName);
      break label203;
      label1154:
      paramViewGroup.eId.setSelected(false);
    }
  }
  
  final class a
  {
    ImageView eId;
    
    public a(View paramView)
    {
      GMTrace.i(20107157831680L, 149810);
      this.eId = ((ImageView)paramView.findViewById(a.e.kwj));
      GMTrace.o(20107157831680L, 149810);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */