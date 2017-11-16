package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ys
  extends com.tencent.mm.bm.a
{
  public kk upA;
  public String upB;
  public boolean upC;
  public int upD;
  public String upx;
  
  public ys()
  {
    GMTrace.i(3966402297856L, 29552);
    GMTrace.o(3966402297856L, 29552);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3966536515584L, 29553);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.upA != null)
      {
        paramVarArgs.fm(1, this.upA.aYq());
        this.upA.a(paramVarArgs);
      }
      if (this.upx != null) {
        paramVarArgs.e(2, this.upx);
      }
      if (this.upB != null) {
        paramVarArgs.e(3, this.upB);
      }
      paramVarArgs.ah(4, this.upC);
      paramVarArgs.fk(5, this.upD);
      GMTrace.o(3966536515584L, 29553);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.upA != null) {
        i = b.a.a.a.fj(1, this.upA.aYq()) + 0;
      }
      paramInt = i;
      if (this.upx != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.upx);
      }
      i = paramInt;
      if (this.upB != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.upB);
      }
      paramInt = b.a.a.b.b.a.cK(4);
      int j = b.a.a.a.fh(5, this.upD);
      GMTrace.o(3966536515584L, 29553);
      return i + (paramInt + 1) + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3966536515584L, 29553);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ys localys = (ys)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3966536515584L, 29553);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((kk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localys.upA = ((kk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966536515584L, 29553);
        return 0;
      case 2: 
        localys.upx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966536515584L, 29553);
        return 0;
      case 3: 
        localys.upB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966536515584L, 29553);
        return 0;
      case 4: 
        localys.upC = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3966536515584L, 29553);
        return 0;
      }
      localys.upD = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3966536515584L, 29553);
      return 0;
    }
    GMTrace.o(3966536515584L, 29553);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */