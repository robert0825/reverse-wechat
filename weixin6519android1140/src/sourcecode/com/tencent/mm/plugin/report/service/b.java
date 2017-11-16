package com.tencent.mm.plugin.report.service;

import com.tencent.gmtrace.GMTrace;

public final class b
  extends com.tencent.mm.bm.a
{
  public int etB;
  public int oqG;
  public int oqH;
  public boolean oqI;
  
  public b()
  {
    GMTrace.i(13126896451584L, 97803);
    GMTrace.o(13126896451584L, 97803);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13127030669312L, 97804);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.etB);
      paramVarArgs.fk(2, this.oqG);
      paramVarArgs.fk(3, this.oqH);
      paramVarArgs.ah(4, this.oqI);
      GMTrace.o(13127030669312L, 97804);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.etB);
      int i = b.a.a.a.fh(2, this.oqG);
      int j = b.a.a.a.fh(3, this.oqH);
      int k = b.a.a.b.b.a.cK(4);
      GMTrace.o(13127030669312L, 97804);
      return paramInt + 0 + i + j + (k + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13127030669312L, 97804);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13127030669312L, 97804);
        return -1;
      case 1: 
        localb.etB = locala.yqV.nj();
        GMTrace.o(13127030669312L, 97804);
        return 0;
      case 2: 
        localb.oqG = locala.yqV.nj();
        GMTrace.o(13127030669312L, 97804);
        return 0;
      case 3: 
        localb.oqH = locala.yqV.nj();
        GMTrace.o(13127030669312L, 97804);
        return 0;
      }
      localb.oqI = locala.csU();
      GMTrace.o(13127030669312L, 97804);
      return 0;
    }
    GMTrace.o(13127030669312L, 97804);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */