

      function adding() {
        var teamName = document.getElementById("teamName").value;
        var teamManager = document.getElementById("teamManager").value;
        var teamMembers = document.getElementById("teamMembers").value;
        var days = document.getElementById("days").value;
        console.log(teamName);
        console.log(teamManager);
        console.log(teamMembers);
        console.log(days);

        var subscriptions = document.getElementById("subscriptions").value;
        var lunch = document.getElementById("lunch").value;
        var snacks = document.getElementById("snacks").value;
        var utilities = document.getElementById("utilities").value;
        var travel = document.getElementById("travel").value;
        var outing = document.getElementById("outing").value;
        var otherexpenses = document.getElementById("otherexpenses").value;
        console.log(subscriptions);
        console.log(lunch);
        console.log(snacks);
        console.log(utilities);
        console.log(travel);
        console.log(outing);
        console.log(otherexpenses);
        
        var totalExpense =
          parseInt(subscriptions) +
          parseInt(lunch) +
          parseInt(snacks) +
          parseInt(utilities) +
          parseInt(travel) +
          parseInt(outing) +
          parseInt(otherexpenses);
          console.log(totalExpense);

        document.getElementById("spanResult").textContent =
          "Total Expenses for team : " + totalExpense + "Rs.";
        document.getElementById("tname").textContent =
          "Team Name: " +
          teamName +
          " | " +
          "Team Manager: " +
          teamManager +
          " | " +
          "Total Members: " +
          teamMembers +
          " | " +
          "Total no of Days: " +
          days;
          
      }