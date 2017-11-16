package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public class GameLibraryCategoriesView
  extends LinearLayout
  implements View.OnClickListener
{
  int lNQ;
  private int lZc;
  private int lZd;
  private LinearLayout lgp;
  private Context mContext;
  
  public GameLibraryCategoriesView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12674716925952L, 94434);
    this.mContext = paramContext;
    GMTrace.o(12674716925952L, 94434);
  }
  
  public final void I(LinkedList<a> paramLinkedList)
  {
    GMTrace.i(12674985361408L, 94436);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      w.e("MicroMsg.GameLibraryCategoriesView", "No categories");
      setVisibility(8);
      GMTrace.o(12674985361408L, 94436);
      return;
    }
    setVisibility(0);
    this.lgp.removeAllViews();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      Object localObject1 = (a)paramLinkedList.next();
      LinearLayout localLinearLayout = new LinearLayout(this.mContext);
      localLinearLayout.setOrientation(1);
      Object localObject2 = new ImageView(this.mContext);
      Object localObject3 = ImageView.ScaleType.MATRIX;
      ((ImageView)localObject2).setScaleType(ImageView.ScaleType.FIT_XY);
      localObject3 = n.Jd();
      String str = ((a)localObject1).izx;
      c.a locala = new c.a();
      locala.gKB = true;
      ((com.tencent.mm.ao.a.a)localObject3).a(str, (ImageView)localObject2, locala.Jn());
      localLinearLayout.addView((View)localObject2, this.lZc, this.lZc);
      localObject2 = new TextView(this.mContext);
      ((TextView)localObject2).setText(((a)localObject1).lZf);
      ((TextView)localObject2).setTextSize(1, 14.0F);
      ((TextView)localObject2).setTextColor(getResources().getColor(R.e.aOa));
      ((TextView)localObject2).setSingleLine(true);
      ((TextView)localObject2).setEllipsize(TextUtils.TruncateAt.END);
      ((TextView)localObject2).setGravity(17);
      ((TextView)localObject2).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      ((TextView)localObject2).setPadding(0, com.tencent.mm.br.a.fromDPToPix(this.mContext, 6), 0, 0);
      localLinearLayout.addView((View)localObject2);
      localLinearLayout.setTag(localObject1);
      localLinearLayout.setOnClickListener(this);
      localObject1 = new LinearLayout.LayoutParams(-1, -2);
      ((LinearLayout.LayoutParams)localObject1).setMargins(this.lZd, 0, this.lZd, 0);
      this.lgp.addView(localLinearLayout, (ViewGroup.LayoutParams)localObject1);
    }
    GMTrace.o(12674985361408L, 94436);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12675119579136L, 94437);
    if (!(paramView.getTag() instanceof a))
    {
      GMTrace.o(12675119579136L, 94437);
      return;
    }
    paramView = (a)paramView.getTag();
    int i = 7;
    if (!bg.nm(paramView.lZg)) {
      c.aa(this.mContext, paramView.lZg);
    }
    for (;;)
    {
      ai.a(this.mContext, 11, paramView.lZe + 100, paramView.position, i, this.lNQ, null);
      GMTrace.o(12675119579136L, 94437);
      return;
      Intent localIntent = new Intent(this.mContext, GameCategoryUI.class);
      localIntent.putExtra("extra_type", 1);
      localIntent.putExtra("extra_category_id", paramView.lZe);
      localIntent.putExtra("extra_category_name", paramView.lZf);
      localIntent.putExtra("game_report_from_scene", paramView.lZe + 100);
      this.mContext.startActivity(localIntent);
      i = 6;
    }
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12674851143680L, 94435);
    super.onFinishInflate();
    this.lgp = ((LinearLayout)findViewById(R.h.bEr));
    int i = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getWidth();
    this.lZc = (i * 100 / 750);
    this.lZd = ((i - this.lZc * 6) / 14);
    this.lgp.setPadding(this.lZd, com.tencent.mm.br.a.fromDPToPix(this.mContext, 12), this.lZd, com.tencent.mm.br.a.fromDPToPix(this.mContext, 12));
    GMTrace.o(12674851143680L, 94435);
  }
  
  public static final class a
  {
    public String izx;
    public int lZe;
    public String lZf;
    public String lZg;
    public int position;
    
    public a()
    {
      GMTrace.i(12763837497344L, 95098);
      GMTrace.o(12763837497344L, 95098);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameLibraryCategoriesView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */