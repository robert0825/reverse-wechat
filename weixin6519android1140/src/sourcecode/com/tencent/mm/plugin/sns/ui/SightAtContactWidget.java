package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;

public class SightAtContactWidget
  extends AtContactWidget
{
  public SightAtContactWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8504840552448L, 63366);
    GMTrace.o(8504840552448L, 63366);
  }
  
  @TargetApi(11)
  public SightAtContactWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8504706334720L, 63365);
    GMTrace.o(8504706334720L, 63365);
  }
  
  protected final int bmK()
  {
    GMTrace.i(8505108987904L, 63368);
    int i = i.i.phr;
    GMTrace.o(8505108987904L, 63368);
    return i;
  }
  
  protected final int bmL()
  {
    GMTrace.i(8505243205632L, 63369);
    int i = i.i.phr;
    GMTrace.o(8505243205632L, 63369);
    return i;
  }
  
  protected final int getLayoutResource()
  {
    GMTrace.i(8504974770176L, 63367);
    int i = i.g.pfa;
    GMTrace.o(8504974770176L, 63367);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SightAtContactWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */