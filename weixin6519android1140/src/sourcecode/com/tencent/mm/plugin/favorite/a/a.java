package com.tencent.mm.plugin.favorite.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.f;

public final class a
  extends com.tencent.mm.plugin.fts.a.a
{
  public a()
  {
    GMTrace.i(16653467254784L, 124078);
    GMTrace.o(16653467254784L, 124078);
  }
  
  public final String getName()
  {
    GMTrace.i(16654004125696L, 124082);
    GMTrace.o(16654004125696L, 124082);
    return "FTS5FavoriteStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(16654272561152L, 124084);
    GMTrace.o(16654272561152L, 124084);
    return 256;
  }
  
  protected final String getTableName()
  {
    GMTrace.i(16653869907968L, 124081);
    GMTrace.o(16653869907968L, 124081);
    return "Favorite";
  }
  
  public final int getType()
  {
    GMTrace.i(16654138343424L, 124083);
    GMTrace.o(16654138343424L, 124083);
    return 256;
  }
  
  protected final void vr()
  {
    GMTrace.i(16653601472512L, 124079);
    if (vs()) {
      this.lvN.l(-106L, 1L);
    }
    GMTrace.o(16653601472512L, 124079);
  }
  
  protected final boolean vs()
  {
    GMTrace.i(16653735690240L, 124080);
    if (!ch(-106, 1))
    {
      GMTrace.o(16653735690240L, 124080);
      return true;
    }
    GMTrace.o(16653735690240L, 124080);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */