package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ss
  extends ayx
{
  public int jWn;
  public double latitude;
  public double longitude;
  public int mIb;
  public int nJX;
  public int uiL;
  
  public ss()
  {
    GMTrace.i(3727360524288L, 27771);
    GMTrace.o(3727360524288L, 27771);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3727494742016L, 27772);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jWn);
      paramVarArgs.fk(3, this.nJX);
      paramVarArgs.fk(4, this.mIb);
      paramVarArgs.fk(5, this.uiL);
      paramVarArgs.a(6, this.latitude);
      paramVarArgs.a(7, this.longitude);
      GMTrace.o(3727494742016L, 27772);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.jWn);
      int j = b.a.a.a.fh(3, this.nJX);
      int k = b.a.a.a.fh(4, this.mIb);
      int m = b.a.a.a.fh(5, this.uiL);
      int n = b.a.a.b.b.a.cK(6);
      int i1 = b.a.a.b.b.a.cK(7);
      GMTrace.o(3727494742016L, 27772);
      return paramInt + i + j + k + m + (n + 8) + (i1 + 8);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3727494742016L, 27772);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ss localss = (ss)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3727494742016L, 27772);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localss.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3727494742016L, 27772);
        return 0;
      case 2: 
        localss.jWn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3727494742016L, 27772);
        return 0;
      case 3: 
        localss.nJX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3727494742016L, 27772);
        return 0;
      case 4: 
        localss.mIb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3727494742016L, 27772);
        return 0;
      case 5: 
        localss.uiL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3727494742016L, 27772);
        return 0;
      case 6: 
        localss.latitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3727494742016L, 27772);
        return 0;
      }
      localss.longitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
      GMTrace.o(3727494742016L, 27772);
      return 0;
    }
    GMTrace.o(3727494742016L, 27772);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */