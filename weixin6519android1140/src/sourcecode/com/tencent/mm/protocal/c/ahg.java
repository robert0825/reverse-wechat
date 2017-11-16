package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ahg
  extends com.tencent.mm.bm.a
{
  public eq uwD;
  public jc uwE;
  public aoa uwF;
  public bho uwG;
  public bab uwH;
  public nm uwI;
  public ug uwJ;
  public uv uwK;
  
  public ahg()
  {
    GMTrace.i(18665256779776L, 139067);
    GMTrace.o(18665256779776L, 139067);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18665390997504L, 139068);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uwD != null)
      {
        paramVarArgs.fm(1, this.uwD.aYq());
        this.uwD.a(paramVarArgs);
      }
      if (this.uwE != null)
      {
        paramVarArgs.fm(2, this.uwE.aYq());
        this.uwE.a(paramVarArgs);
      }
      if (this.uwF != null)
      {
        paramVarArgs.fm(3, this.uwF.aYq());
        this.uwF.a(paramVarArgs);
      }
      if (this.uwG != null)
      {
        paramVarArgs.fm(4, this.uwG.aYq());
        this.uwG.a(paramVarArgs);
      }
      if (this.uwH != null)
      {
        paramVarArgs.fm(6, this.uwH.aYq());
        this.uwH.a(paramVarArgs);
      }
      if (this.uwI != null)
      {
        paramVarArgs.fm(7, this.uwI.aYq());
        this.uwI.a(paramVarArgs);
      }
      if (this.uwJ != null)
      {
        paramVarArgs.fm(8, this.uwJ.aYq());
        this.uwJ.a(paramVarArgs);
      }
      if (this.uwK != null)
      {
        paramVarArgs.fm(9, this.uwK.aYq());
        this.uwK.a(paramVarArgs);
      }
      GMTrace.o(18665390997504L, 139068);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uwD != null) {
        i = b.a.a.a.fj(1, this.uwD.aYq()) + 0;
      }
      paramInt = i;
      if (this.uwE != null) {
        paramInt = i + b.a.a.a.fj(2, this.uwE.aYq());
      }
      i = paramInt;
      if (this.uwF != null) {
        i = paramInt + b.a.a.a.fj(3, this.uwF.aYq());
      }
      paramInt = i;
      if (this.uwG != null) {
        paramInt = i + b.a.a.a.fj(4, this.uwG.aYq());
      }
      i = paramInt;
      if (this.uwH != null) {
        i = paramInt + b.a.a.a.fj(6, this.uwH.aYq());
      }
      paramInt = i;
      if (this.uwI != null) {
        paramInt = i + b.a.a.a.fj(7, this.uwI.aYq());
      }
      i = paramInt;
      if (this.uwJ != null) {
        i = paramInt + b.a.a.a.fj(8, this.uwJ.aYq());
      }
      paramInt = i;
      if (this.uwK != null) {
        paramInt = i + b.a.a.a.fj(9, this.uwK.aYq());
      }
      GMTrace.o(18665390997504L, 139068);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18665390997504L, 139068);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ahg localahg = (ahg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 5: 
      default: 
        GMTrace.o(18665390997504L, 139068);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahg.uwD = ((eq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(18665390997504L, 139068);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahg.uwE = ((jc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(18665390997504L, 139068);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aoa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aoa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahg.uwF = ((aoa)localObject1);
          paramInt += 1;
        }
        GMTrace.o(18665390997504L, 139068);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bho();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bho)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahg.uwG = ((bho)localObject1);
          paramInt += 1;
        }
        GMTrace.o(18665390997504L, 139068);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bab();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bab)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahg.uwH = ((bab)localObject1);
          paramInt += 1;
        }
        GMTrace.o(18665390997504L, 139068);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahg.uwI = ((nm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(18665390997504L, 139068);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ug();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ug)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahg.uwJ = ((ug)localObject1);
          paramInt += 1;
        }
        GMTrace.o(18665390997504L, 139068);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new uv();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((uv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localahg.uwK = ((uv)localObject1);
        paramInt += 1;
      }
      GMTrace.o(18665390997504L, 139068);
      return 0;
    }
    GMTrace.o(18665390997504L, 139068);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */