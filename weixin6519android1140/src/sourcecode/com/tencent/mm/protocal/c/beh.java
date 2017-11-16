package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class beh
  extends com.tencent.mm.bm.a
{
  public int nFo;
  public String tYP;
  public LinkedList<aup> uPW;
  public rz uPX;
  public LinkedList<axt> uPY;
  public int uPZ;
  public bz urB;
  
  public beh()
  {
    GMTrace.i(3740245426176L, 27867);
    this.uPW = new LinkedList();
    this.uPY = new LinkedList();
    GMTrace.o(3740245426176L, 27867);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3740379643904L, 27868);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.nFo);
      paramVarArgs.d(2, 8, this.uPW);
      if (this.uPX != null)
      {
        paramVarArgs.fm(3, this.uPX.aYq());
        this.uPX.a(paramVarArgs);
      }
      if (this.urB != null)
      {
        paramVarArgs.fm(4, this.urB.aYq());
        this.urB.a(paramVarArgs);
      }
      paramVarArgs.d(5, 8, this.uPY);
      paramVarArgs.fk(6, this.uPZ);
      if (this.tYP != null) {
        paramVarArgs.e(7, this.tYP);
      }
      GMTrace.o(3740379643904L, 27868);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.nFo) + 0 + b.a.a.a.c(2, 8, this.uPW);
      paramInt = i;
      if (this.uPX != null) {
        paramInt = i + b.a.a.a.fj(3, this.uPX.aYq());
      }
      i = paramInt;
      if (this.urB != null) {
        i = paramInt + b.a.a.a.fj(4, this.urB.aYq());
      }
      i = i + b.a.a.a.c(5, 8, this.uPY) + b.a.a.a.fh(6, this.uPZ);
      paramInt = i;
      if (this.tYP != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tYP);
      }
      GMTrace.o(3740379643904L, 27868);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uPW.clear();
      this.uPY.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3740379643904L, 27868);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      beh localbeh = (beh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3740379643904L, 27868);
        return -1;
      case 1: 
        localbeh.nFo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3740379643904L, 27868);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aup();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aup)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbeh.uPW.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3740379643904L, 27868);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbeh.uPX = ((rz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3740379643904L, 27868);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbeh.urB = ((bz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3740379643904L, 27868);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbeh.uPY.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3740379643904L, 27868);
        return 0;
      case 6: 
        localbeh.uPZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3740379643904L, 27868);
        return 0;
      }
      localbeh.tYP = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3740379643904L, 27868);
      return 0;
    }
    GMTrace.o(3740379643904L, 27868);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\beh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */