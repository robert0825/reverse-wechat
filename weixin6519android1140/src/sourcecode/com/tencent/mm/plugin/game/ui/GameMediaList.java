package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public class GameMediaList
  extends LinearLayout
  implements View.OnClickListener
{
  String appId;
  int kSi;
  int lXV;
  int lZU;
  private LinkedList<String> lZV;
  Context mContext;
  
  public GameMediaList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12698876116992L, 94614);
    this.appId = "";
    this.kSi = -1;
    this.lXV = 0;
    GMTrace.o(12698876116992L, 94614);
  }
  
  public final void S(LinkedList<a> paramLinkedList)
  {
    GMTrace.i(12699010334720L, 94615);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      setVisibility(8);
      GMTrace.o(12699010334720L, 94615);
      return;
    }
    this.lZV = new LinkedList();
    int i = 0;
    while (i < paramLinkedList.size())
    {
      localObject = (a)paramLinkedList.get(i);
      if ((!bg.nm(((a)localObject).url)) && (((a)localObject).type == 0)) {
        this.lZV.add(((a)localObject).url);
      }
      i += 1;
    }
    removeAllViews();
    Object localObject = (LayoutInflater)getContext().getSystemService("layout_inflater");
    i = 0;
    while (i < paramLinkedList.size())
    {
      a locala = (a)paramLinkedList.get(i);
      if (!bg.nm(locala.lZW))
      {
        View localView = ((LayoutInflater)localObject).inflate(this.lZU, this, false);
        ImageView localImageView = (ImageView)localView.findViewById(R.h.bMJ);
        a locala1 = n.Jd();
        String str = locala.lZW;
        c.a locala2 = new c.a();
        locala2.gKB = true;
        locala1.a(str, localImageView, locala2.Jn());
        if (locala.type == 1) {
          localView.findViewById(R.h.bMF).setVisibility(0);
        }
        addView(localView);
        localImageView.setTag(locala);
        localImageView.setOnClickListener(this);
      }
      i += 1;
    }
    setVisibility(0);
    GMTrace.o(12699010334720L, 94615);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12699144552448L, 94616);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      w.i("MicroMsg.GameMediaList", "Invalid tag");
      GMTrace.o(12699144552448L, 94616);
      return;
    }
    paramView = (a)paramView.getTag();
    switch (paramView.type)
    {
    }
    for (;;)
    {
      GMTrace.o(12699144552448L, 94616);
      return;
      c.aa(getContext(), paramView.url);
      ai.a(this.mContext, this.kSi, 1202, 1, 13, this.appId, this.lXV, null);
      GMTrace.o(12699144552448L, 94616);
      return;
      paramView = paramView.url;
      int j = this.lZV.indexOf(paramView);
      int i = j;
      if (j < 0) {
        i = 0;
      }
      paramView = new Intent(getContext(), GameGalleryUI.class);
      String[] arrayOfString = new String[this.lZV.size()];
      this.lZV.toArray(arrayOfString);
      paramView.putExtra("URLS", arrayOfString);
      paramView.putExtra("CURRENT", i);
      paramView.putExtra("REPORT_APPID", this.appId);
      paramView.putExtra("REPORT_SCENE", this.kSi);
      paramView.putExtra("SOURCE_SCENE", this.lXV);
      getContext().startActivity(paramView);
    }
  }
  
  public static final class a
  {
    public String lZW;
    public int type;
    public String url;
    
    public a()
    {
      GMTrace.i(12762226884608L, 95086);
      GMTrace.o(12762226884608L, 95086);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameMediaList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */