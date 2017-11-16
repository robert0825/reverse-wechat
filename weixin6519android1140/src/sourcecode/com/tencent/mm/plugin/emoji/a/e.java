package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.List;

public final class e
  extends ArrayAdapter<EmojiGroupInfo>
{
  private static final int kgC;
  private final String TAG;
  private int kgD;
  public List<EmojiGroupInfo> kgE;
  private Context mContext;
  
  static
  {
    GMTrace.i(11332539645952L, 84434);
    kgC = R.i.cuF;
    GMTrace.o(11332539645952L, 84434);
  }
  
  public e(Context paramContext, List<EmojiGroupInfo> paramList)
  {
    super(paramContext, kgC, paramList);
    GMTrace.i(11332002775040L, 84430);
    this.TAG = "MicroMsg.emoji.EmojiSortAdapter";
    this.kgD = paramContext.getResources().getDimensionPixelSize(R.f.aRS);
    this.mContext = paramContext;
    this.kgE = paramList;
    GMTrace.o(11332002775040L, 84430);
  }
  
  public final void aqm()
  {
    GMTrace.i(11332136992768L, 84431);
    if (this.kgE == null)
    {
      GMTrace.o(11332136992768L, 84431);
      return;
    }
    int j = this.kgE.size();
    int i = 0;
    while (i < j)
    {
      ((EmojiGroupInfo)this.kgE.get(i)).field_idx = i;
      i += 1;
    }
    h.arl().kjz.cu(this.kgE);
    EmojiGroupInfo localEmojiGroupInfo = h.arl().kjz.aW(EmojiGroupInfo.vCm, false);
    localEmojiGroupInfo.field_sort = (this.kgE.size() + 2);
    com.tencent.mm.storage.emotion.a locala = h.arl().kjz;
    if (!com.tencent.mm.storage.emotion.a.bUC())
    {
      locala = h.arl().kjz;
      if (localEmojiGroupInfo != null)
      {
        w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks updateEmojiGroupInfo: packname: %s, lasttime: %d, sort: %d", new Object[] { localEmojiGroupInfo.field_packName, Long.valueOf(localEmojiGroupInfo.field_lastUseTime), Integer.valueOf(localEmojiGroupInfo.field_sort) });
        locala.a(localEmojiGroupInfo);
        locala.a("event_update_group", 0, bg.bQW().toString());
      }
    }
    GMTrace.o(11332136992768L, 84431);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11332271210496L, 84432);
    EmojiGroupInfo localEmojiGroupInfo;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(kgC, null);
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
      localEmojiGroupInfo = (EmojiGroupInfo)getItem(paramInt);
      if (!com.tencent.mm.plugin.emoji.h.a.b(localEmojiGroupInfo)) {
        break label141;
      }
      paramViewGroup.hqH.setText(R.l.dpp);
      label77:
      if (!com.tencent.mm.plugin.emoji.h.a.b(localEmojiGroupInfo)) {
        break label156;
      }
      paramViewGroup.iub.setImageResource(R.g.aXk);
    }
    for (;;)
    {
      if (paramInt + 1 == getCount()) {
        paramViewGroup.kgF.setBackgroundResource(R.g.aVP);
      }
      paramView.setVisibility(0);
      GMTrace.o(11332271210496L, 84432);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label141:
      paramViewGroup.hqH.setText(localEmojiGroupInfo.field_packName);
      break label77;
      label156:
      n.Jd().a(localEmojiGroupInfo.field_packIconUrl, paramViewGroup.iub, f.bQ(localEmojiGroupInfo.field_productID, localEmojiGroupInfo.field_packIconUrl));
    }
  }
  
  final class a
  {
    TextView hqH;
    ImageView iub;
    View kgF;
    ImageView kgG;
    
    public a(View paramView)
    {
      GMTrace.i(11330257944576L, 84417);
      this.kgG = ((ImageView)paramView.findViewById(R.h.bwl));
      this.iub = ((ImageView)paramView.findViewById(R.h.bwj));
      this.hqH = ((TextView)paramView.findViewById(R.h.bwk));
      this.kgF = paramView.findViewById(R.h.bvV);
      ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
      if (localLayoutParams != null)
      {
        localLayoutParams.height = e.a(e.this);
        paramView.setLayoutParams(localLayoutParams);
      }
      GMTrace.o(11330257944576L, 84417);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */