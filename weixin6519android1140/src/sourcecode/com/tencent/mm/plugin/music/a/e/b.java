package com.tencent.mm.plugin.music.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ab.d;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource.Factory;

public final class b
  implements IDataSource.Factory
{
  public d grU;
  
  public b(d paramd)
  {
    GMTrace.i(20506187137024L, 152783);
    this.grU = paramd;
    GMTrace.o(20506187137024L, 152783);
  }
  
  public final IDataSource createDataSource()
  {
    GMTrace.i(20506321354752L, 152784);
    a locala = new a(this.grU);
    GMTrace.o(20506321354752L, 152784);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */