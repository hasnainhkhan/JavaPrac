import subprocess
import datetime

# Days of week
days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]
commits = []

for day in days:
    count = subprocess.getoutput(
        f'git log --pretty=format:"%h" --since="last {day}" --until="{day}" | wc -l'
    )
    commits.append(int(count))

# Bar chart banaao
chart = []
for d, c in zip(days, commits):
    blocks = "█" * c
    empty = "░" * (12 - c if c < 12 else 0)
    chart.append(f"- {d}: {blocks}{empty} ({c} commits)")

# README.md update karo
with open("README.md", "w") as f:
    f.write("# 📊 Activity Tracker\n\n")
    f.write("## 🔥 Weekly Activity\n\n")
    f.write("\n".join(chart))
    f.write("\n\n---\n\n")
    f.write("*(Auto-updated using GitHub Actions)*\n")
