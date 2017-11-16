package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class GameRankUI
  extends MMActivity
{
  private ListView lWA;
  private GameRankView mbp;
  
  public GameRankUI()
  {
    GMTrace.i(12700620947456L, 94627);
    GMTrace.o(12700620947456L, 94627);
  }
  
  protected final void MP()
  {
    GMTrace.i(12701157818368L, 94631);
    oM(R.l.dzV);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12698741899264L, 94613);
        GameRankUI.this.finish();
        GMTrace.o(12698741899264L, 94613);
        return true;
      }
    });
    this.mbp = ((GameRankView)findViewById(R.h.bEO));
    this.lWA = ((ListView)this.mbp.findViewById(R.h.bER));
    new View(this).setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(R.f.aQq)));
    Object localObject = (LayoutInflater)getSystemService("layout_inflater");
    View localView = ((LayoutInflater)localObject).inflate(R.i.czl, this.lWA, false);
    localObject = ((LayoutInflater)localObject).inflate(R.i.czl, this.lWA, false);
    this.lWA.addHeaderView(localView);
    this.lWA.addFooterView((View)localObject);
    GMTrace.o(12701157818368L, 94631);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12701023600640L, 94630);
    int i = R.i.bEO;
    GMTrace.o(12701023600640L, 94630);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12700755165184L, 94628);
    super.onCreate(paramBundle);
    MP();
    paramBundle = this.mbp;
    getIntent().getStringExtra("extra_app_id");
    LinkedList localLinkedList = new LinkedList();
    Serializable localSerializable = getIntent().getSerializableExtra("extra_user_ranks");
    if ((localSerializable != null) && ((localSerializable instanceof List))) {
      localLinkedList.addAll((List)localSerializable);
    }
    if (localLinkedList.size() == 0)
    {
      paramBundle.mbs.setVisibility(0);
      paramBundle.mbr.setVisibility(8);
      GMTrace.o(12700755165184L, 94628);
      return;
    }
    paramBundle.mbt.T(localLinkedList);
    paramBundle.mbr.setAdapter(paramBundle.mbt);
    paramBundle.mbs.setVisibility(8);
    paramBundle.mbr.setVisibility(0);
    GMTrace.o(12700755165184L, 94628);
  }
  
  public void onResume()
  {
    GMTrace.i(12700889382912L, 94629);
    super.onResume();
    GMTrace.o(12700889382912L, 94629);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameRankUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */