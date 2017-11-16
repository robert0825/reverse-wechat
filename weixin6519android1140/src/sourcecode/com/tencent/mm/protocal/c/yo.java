package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class yo
  extends ayx
{
  public double latitude;
  public double longitude;
  public int scene;
  public String upx;
  
  public yo()
  {
    GMTrace.i(3879563427840L, 28905);
    GMTrace.o(3879563427840L, 28905);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3879697645568L, 28906);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.a(2, this.latitude);
      paramVarArgs.a(3, this.longitude);
      paramVarArgs.fk(4, this.scene);
      if (this.upx != null) {
        paramVarArgs.e(5, this.upx);
      }
      GMTrace.o(3879697645568L, 28906);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8) + b.a.a.a.fh(4, this.scene);
      paramInt = i;
      if (this.upx != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.upx);
      }
      GMTrace.o(3879697645568L, 28906);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3879697645568L, 28906);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      yo localyo = (yo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3879697645568L, 28906);
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
          localyo.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3879697645568L, 28906);
        return 0;
      case 2: 
        localyo.latitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3879697645568L, 28906);
        return 0;
      case 3: 
        localyo.longitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3879697645568L, 28906);
        return 0;
      case 4: 
        localyo.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3879697645568L, 28906);
        return 0;
      }
      localyo.upx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3879697645568L, 28906);
      return 0;
    }
    GMTrace.o(3879697645568L, 28906);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\yo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */