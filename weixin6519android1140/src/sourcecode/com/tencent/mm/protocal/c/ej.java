package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ej
  extends com.tencent.mm.bm.a
  implements bed
{
  public String ID;
  public azp tSB;
  public String tSS;
  public int tST;
  public azp tSU;
  public String tSV;
  public int tSW;
  public String tSX;
  public String tSY;
  
  public ej()
  {
    GMTrace.i(4021028913152L, 29959);
    GMTrace.o(4021028913152L, 29959);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4021297348608L, 29961);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSU == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
      }
      if (this.tSB == null) {
        throw new b("Not all required fields were included: Key");
      }
      paramVarArgs.fk(1, this.tST);
      if (this.tSU != null)
      {
        paramVarArgs.fm(2, this.tSU.aYq());
        this.tSU.a(paramVarArgs);
      }
      if (this.tSV != null) {
        paramVarArgs.e(3, this.tSV);
      }
      if (this.tSB != null)
      {
        paramVarArgs.fm(4, this.tSB.aYq());
        this.tSB.a(paramVarArgs);
      }
      if (this.tSX != null) {
        paramVarArgs.e(5, this.tSX);
      }
      if (this.tSY != null) {
        paramVarArgs.e(6, this.tSY);
      }
      paramVarArgs.fk(7, this.tSW);
      if (this.ID != null) {
        paramVarArgs.e(8, this.ID);
      }
      if (this.tSS != null) {
        paramVarArgs.e(9, this.tSS);
      }
      GMTrace.o(4021297348608L, 29961);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0;
      paramInt = i;
      if (this.tSU != null) {
        paramInt = i + b.a.a.a.fj(2, this.tSU.aYq());
      }
      i = paramInt;
      if (this.tSV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tSV);
      }
      paramInt = i;
      if (this.tSB != null) {
        paramInt = i + b.a.a.a.fj(4, this.tSB.aYq());
      }
      i = paramInt;
      if (this.tSX != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tSX);
      }
      paramInt = i;
      if (this.tSY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tSY);
      }
      i = paramInt + b.a.a.a.fh(7, this.tSW);
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ID);
      }
      i = paramInt;
      if (this.tSS != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tSS);
      }
      GMTrace.o(4021297348608L, 29961);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tSU == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
      }
      if (this.tSB == null) {
        throw new b("Not all required fields were included: Key");
      }
      GMTrace.o(4021297348608L, 29961);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ej localej = (ej)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4021297348608L, 29961);
        return -1;
      case 1: 
        localej.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localej.tSU = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 3: 
        localej.tSV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localej.tSB = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 5: 
        localej.tSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 6: 
        localej.tSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 7: 
        localej.tSW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      case 8: 
        localej.ID = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4021297348608L, 29961);
        return 0;
      }
      localej.tSS = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4021297348608L, 29961);
      return 0;
    }
    GMTrace.o(4021297348608L, 29961);
    return -1;
  }
  
  public final int getRet()
  {
    GMTrace.i(4021163130880L, 29960);
    int i = this.tST;
    GMTrace.o(4021163130880L, 29960);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */